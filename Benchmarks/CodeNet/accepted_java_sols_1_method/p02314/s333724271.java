import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m];
		for(int i = 0; i < m; i++){
			c[i] = sc.nextInt();
		}
		int[] DP = new int[n+1];
		Arrays.fill(DP,999999);
		DP[0] = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < m; j++){
				if(i-c[j]>=0){
					DP[i] = Math.min(DP[i],DP[i-c[j]]+1);
				}
			}
		}
		System.out.println(DP[n]);
	}
}

