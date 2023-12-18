import java.util.Scanner;

public class Main {

	static int W,H,n,ans;
	static int[] id;
	static int[][] field,memo;
	static int[][] ansfield;
	static int[][][] kukaku;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			W=cin.nextInt();
			H=cin.nextInt();
			n=cin.nextInt();
			if(W+H+n==0)break;
			ans=0;
			memo = new int[n][2];
			
			field= new int[H][W];
			ansfield= new int[H][W];
			kukaku=new int[n][101][2];
			id=new int[n];
			for(int i=0;i<n;i++){
				memo[i][0]=cin.nextInt();
				id[i]=memo[i][0];
				memo[i][1]=cin.nextInt();
				int cnt=0;
				for(int j=1;j<=memo[i][1];j++){
					if(memo[i][1]%j==0){
						kukaku[i][cnt][0]=j;
						kukaku[i][cnt][1]=memo[i][1]/j;
						cnt++;
					}
					kukaku[i][100][0]=cnt;
				}
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					field[i][j]=cin.nextInt();
				}
			}
			bt(0);
			if(ans==0||ans>1){
				System.out.println("NA");
			}
			else{
				outputans();
			}
			
			
			
		}
	}
	static void bt(int step){
		if(step==n){
			if(ans==0){
				for(int i=0;i<H;i++){
					for(int j=0;j<W;j++){
						ansfield[i][j]=field[i][j];
					}
				}
			}
			ans++;
			return;
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if(field[i][j]==id[step]){
					fit(i,j,step);
				}
			}
		}
	}
	static void fit(int x,int y,int step){
		for(int i=0;i<kukaku[step][100][0];i++){
			for(int k=x-kukaku[step][i][0]+1;k<=x;k++){
				if(k<0||k>=H)continue;
				for(int h=y-kukaku[step][i][1]+1;h<=y;h++){
					if(h<0||h>=W)continue;
					
					boolean f = true;
					//テ・ツァツ凝ァツつケテ」ツ?渓,h
					for(int a=k;a<k+kukaku[step][i][0];a++){
						for(int b=h;b<h+kukaku[step][i][1];b++){
							if(a<0||a>=H||b<0||b>=W){
								f=false;
								break;
							}
							
							
							// (k,h)-(a,b)テ」ツつ段d[step]テ」ツ?ァテ・ツ。ツ療」ツつ?
							if(field[a][b]!=0&&field[a][b]!=id[step]){
//								System.out.println(a+" "+b+" "+id[step]);
								f=false;
								break;
							}
							
						}
					}
//					output(); 
//					System.out.println(kukaku[step][i][0]+" "+kukaku[step][i][1]);
//					System.out.println(k+" "+h);
//					System.out.println();
					if(!f)continue;
					// テ・ツ。ツ療」ツつ?
					for(int a=k;a<k+kukaku[step][i][0];a++){
						for(int b=h;b<h+kukaku[step][i][1];b++){
							field[a][b]=id[step];
						}
					}
					bt(step+1);
					// テヲツ按サテ」ツ??
					for(int a=k;a<k+kukaku[step][i][0];a++){
						for(int b=h;b<h+kukaku[step][i][1];b++){
							field[a][b]=0;
						}
					}
					field[x][y]=id[step];
					
					
					
				}
			}
		}
		
		
		
		
	}
	static void output(){
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void outputans(){
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				
				if(j==W-1){
					System.out.print(ansfield[i][j]);	
				}
				else{
					System.out.print(ansfield[i][j]+" ");	
				}
			}
			System.out.println();
		}
	}
}