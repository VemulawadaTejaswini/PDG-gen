import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int team1;
		int team2;
		int point1;
		int point2;
		int[] win=new int[100];
		int[] total=new int[100];
		int N=n*(n-1)/2;
		for(int i=0;i<N;i++){
			team1=sc.nextInt();
			team2=sc.nextInt();
			point1=sc.nextInt();
			point2=sc.nextInt();
			if(point1>point2){
				win[team1-1]=win[team1-1]+3;
			}
			else if(point1<point2){
				win[team2-1]=win[team2-1]+3;
			}
			else{
				win[team1-1]=win[team1-1]+1;
				win[team2-1]=win[team2-1]+1;
			}
		}
		for(int a=0;a<n;a++){
			int r = 1;
			for(int j=0;j<n;j++){
				if(win[a]<win[j]){
					r = r + 1;
				}
				
			}
			total[a] = total[a] + r;
			
		}
		for(int b = 0; b < n; b++){
			System.out.println(total[b]);
			
		}
	}
}