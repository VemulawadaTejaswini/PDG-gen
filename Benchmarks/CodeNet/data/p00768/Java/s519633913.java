import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(m==0 && t==0 && p==0 && r==0) break;
			calc(m, t, p, r);
		}
	}
	public void calc(int m, int t, int p, int r){
		int[][] ptimes = new int[50][10];
		int[] rtimes = new int[50];
		int[] rnum = new int[50];
		
		for(int k = 0; k < r; k++){
			int mk = sc.nextInt();
			int tk = sc.nextInt();
			int pk = sc.nextInt();
			int jk = sc.nextInt();
			
			if(jk == 0){
				rtimes[tk-1] += mk + ptimes[tk-1][pk-1];
				rnum[tk-1] += 1;
			}
			else{
				ptimes[tk-1][pk-1] += 20;
			}
		}
		
		int beforetimes = 0;
		int beforenum = 0;
		int mintimes = Integer.MAX_VALUE;
		int maxnum = -1;
		int team = 0;
		int flug = 0;
		for(int i = 0; i < t; i++){
			for(int k = t; k > 0; k--){
				if(rnum[k-1] > maxnum){
					maxnum = rnum[k-1];
					mintimes = rtimes[k-1];
					team = k;
				}
				else if(rnum[k-1] == maxnum && rtimes[k-1] < mintimes){
					maxnum = rnum[k-1];
					mintimes = rtimes[k-1];
					team = k;
				}
			}
			if(flug == 0){
				flug = 1;
			}
			else{
				if(beforenum == maxnum && beforetimes == mintimes) System.out.print("=");
				else System.out.print(",");
			}
			System.out.print(team);
			beforetimes = mintimes;
			beforenum = maxnum;
			mintimes = Integer.MAX_VALUE;
			maxnum = -1;
			rnum[team-1] = -1;
			rtimes[team-1] = Integer.MAX_VALUE;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}