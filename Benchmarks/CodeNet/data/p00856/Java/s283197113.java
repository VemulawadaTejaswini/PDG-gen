import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();
			if(n == 0 && t == 0 && l == 0 && b == 0)break;
			else calc(n,t,l,b);
			
		}
	}
	
	public void calc(int n, int t, int l, int b){
		int[] masu = new int[n+1];
		for(int i = 0; i < l; i++){
			masu[sc.nextInt()] = 1;
		}
		for(int i = 0; i < b; i ++){
			masu[sc.nextInt()] = -1;
		}
		
		double[][] dp = new double[105][105];
		dp[0][0] = 1;
		
		for(int tt = 0; tt < t+1; tt++){
			for(int nn = 0; nn < n; nn++){
				for(int k = 1; k < 7; k++){
					int next = nn + k;
					if(next > n) next = n - next + n;
					if(masu[next] == -1) next = 0;
					
					if(masu[next] == 1)	 dp[tt+2][next] += dp[tt][nn] / 6;
					else dp[tt+1][next] += dp[tt][nn] / 6;
				}
				nn = nn;
			}
		}
		
		double ans = 0;
		for(int i = 0; i < t+1; i++){
			ans += dp[i][n];
		}
		System.out.printf("%.7f\n", ans);
	}
	
	public void calc2(int n, int t, int l, int b){
		int[] masu = new int[n+1];
		for(int i = 0; i < l; i++){
			masu[sc.nextInt()] = 1;
		}
		for(int i = 0; i < b; i ++){
			masu[sc.nextInt()] = -1;
		}
		double ans = 0;
		int[] nowList = new int[n+1];
		int[] nowMachi = new int[n+1];
		nowList[0] = 1;
		for(int a = 0; a < t; a++){
			int sum = 0;
			int[] nextList = new int[n+1];
			int[] nextMachi = new int[n+1];
			for(int i = 0; i < n+1; i++){
				int nowNum = nowList[i];
				
				if(nowNum > 0){
					for(int k = 1; k < 7; k++){
						int next = i + k;
						if(next > n) next = n - (next - n);
						
						if(next == n) sum+=nowNum;
						else if(masu[next] == -1) nextList[0] += nowNum;
						else if(masu[next] == 1) nextMachi[next] += nowNum;
						else nextList[next] += nowNum;
					}
				}
			}
			for(int i = 0; i < n+1; i++){
				nextList[i] += nowMachi[i];
			}
			nowList = nextList;
			nowMachi = nextMachi;
			ans += ((double)sum) / Math.pow(6, (a+1));
		}
		System.out.printf("%.7f\n", ans);
	}
	

	public static void main(String[] args) {
		new Main().run();
	}
}