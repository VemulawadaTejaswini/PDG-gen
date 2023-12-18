import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0)break;
			Frame[][] f=new Frame[N][10];
			Ans[] ans=new Ans[N];
			int[] names=new int[N];
			for(int j=0;j<N;j++){
				for(int i=0;i<10;i++){
					f[j][i]=new Frame();
					
				}
			}
			for(int j=0;j<N;j++){
				for(int i=0;i<10;i++){
					if(i<=7){
						f[j][i].next=f[j][i+1];
						f[j][i].nnext=f[j][i+2];
					}
					if(i==8){
						f[j][i].next=f[j][i+1];
					}
				}				
			}
			for(int i=0;i<N;i++){
				names[i]=cin.nextInt();
				int frames=0;
				int first=0;
				int strike=0;
				while(frames<=9){
//					System.out.println(frames+" "+first+" "+strike);
					if(frames==9){
						boolean flag = false;
						if(first==2&&strike==0){
							break;
						}
						else if(first==2){
							flag=true;
						}
						int p=cin.nextInt();
						for(int j=0;j<9;j++){
							if(f[i][j].strike>=1){
								f[i][j].strike++;
								f[i][j].point+=p;
								if(f[i][j].strike==3){
									f[i][j].strike=0;
								}
							}
						}
						
						
						
						f[i][frames].point+=p;
						if(f[i][frames].point>=10){
							strike++;
						}
						if(first==0&&f[i][frames-1].spare){
							f[i][frames-1].point+=p;
						}
						if(flag)frames++;
						first++;
						continue;
					}
					int p=cin.nextInt();
					for(int j=0;j<10;j++){
						if(f[i][j].strike>=1){
							f[i][j].strike++;
							f[i][j].point+=p;
							if(f[i][j].strike==3){
								f[i][j].strike=0;
							}
						}
					}
					if(p==10){
						f[i][frames].point+=p;
						f[i][frames].strike=1;

						
						if(frames-1>=0&&f[i][frames-1].spare){
							f[i][frames-1].point+=p;
						}
						frames++;
						first=0;						
						continue;
					}
					f[i][frames].point+=p;

					if(f[i][frames].point==10){
						f[i][frames].spare=true;
					}
					if(first==0){
						first++;
						if(frames-1>=0&&f[i][frames-1].spare){
							f[i][frames-1].point+=p;
//							System.out.println("spare");
						}
					}
					else{
						first=0;
						frames++;
					}
					if(frames==10)break;
				}
				int sum=0;
				for(int j=0;j<10;j++){
//					System.out.println(f[i][j].point);
					sum+=f[i][j].point;
				}
//				System.out.println(names[i]+" "+sum);
				ans[i]=new Ans(names[i],sum);
			}
			Arrays.sort(ans);
			for(int i=0;i<N;i++){
				System.out.println(ans[i].name+" "+ans[i].score);
			}
			
			
		}
	}
	static class Ans implements Comparable<Ans>{
		int name;
		int score;
		Ans(int a,int b){
			name=a;
			score=b;
		}
		
		public int compareTo(Ans o) {
			if(this.score==o.score)
				return name-o.name;
			return -(this.score-o.score);
		}
		
	}
	static class Frame{
		Frame next;
		Frame nnext;
		int strike;
		boolean spare;
		int point;
		Frame(){
			
		}
		void calc(){
		}
	}
}