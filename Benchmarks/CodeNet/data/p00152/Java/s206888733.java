import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			N=Integer.parseInt(cin.nextLine());
			if(N==0)break;
			Ans[] ans=new Ans[N];
			for(int i=0;i<N;i++){
				String[]s= cin.nextLine().split(" ");
				int name=Integer.parseInt(s[0]);
				int[] score=new int[s.length-1];
				for(int j=1;j<s.length;j++){
					score[j-1]=Integer.parseInt(s[j]);
				}
				for(int j=0;j<score.length;j++){
//					System.out.println(score[j]);
				}
				int total=0;
				int sum=0;
				int first=0;
				int frame=1;
				for(int j=0;j<score.length;j++){
					if(frame==10){
						total+=score[j];
						
						continue;
					}
					total+=score[j];
					sum+=score[j];
					if(score[j]==10){
						total+=score[j+1]+score[j+2];
						frame++;
						first=0;
						sum=0;
						continue;
					}
					if(sum==10){
						total+=score[j+1];
						frame++;
						first=0;
						sum=0;
						continue;
					}
					if(first==1){
						frame++;
						sum=0;
						first=0;
						continue;
					}
					first++;
				}
				ans[i]=new Ans(name,total);
			}
			Arrays.sort(ans);
			for(int i=0;i<ans.length;i++){
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
}