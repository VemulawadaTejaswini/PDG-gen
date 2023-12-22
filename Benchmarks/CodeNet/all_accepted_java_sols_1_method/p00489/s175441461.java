import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int j,n,team1,team2,point1,point2,cnt;
		
		n=sc.nextInt();
		int score[]=new int[n+1];
		int stand[]=new int[n+1];
		for(int i=0;i<n*(n-1)/2;i++){
			team1=sc.nextInt();
			team2=sc.nextInt();
			point1=sc.nextInt();
			point2=sc.nextInt();			
			if(point1>point2){
				score[team1]+=3;
			}
			else if(point1<point2){
				score[team2]+=3;
			}
			else{
				score[team1]+=1;
				score[team2]+=1;
			}
		}
		for(int i=1;i<=n;i++){
			cnt=1;
			for(j=1;j<=n;j++){
				if(score[i]<score[j]){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}