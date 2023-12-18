import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int count = 0;
			while(true) {
				int W = sc.nextInt();
				if(W == 0)break;
				count++;
				int N = sc.nextInt();
				//dp[重さ] = max 価値
				long[] dp = new long[W+1];
				int[] v = new int[N];
				int[] w = new int[N];
				for(int i=0; i<N; i++) {
					String str = sc.next();
					String[] strs = str.split(",");
					v[i] = Integer.parseInt(strs[0]);
					w[i] = Integer.parseInt(strs[1]);
				}
				for(int i=0; i<W+1; i++) {
					dp[i] = 0;
				}
				for(int i=0; i<N; i++) {
					for(int j=W; j>0; j--) {
						if(j-w[i] >= 0)
							dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
					}
				}
				for(int i=0; i<W+1; i++) {
					if(dp[i] == dp[W]) {
						System.out.println("Case "+count+":");
						System.out.println(dp[i]);
						System.out.println(i);
						break;
					}
				}
			}

		}
	}

}


