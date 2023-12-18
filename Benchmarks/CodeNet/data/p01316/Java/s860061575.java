import java.util.*;


public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true){
				int n = sc.nextInt(), m = sc.nextInt();

				if(n==0 && m==0){
					sc.close();
					break;
				}
				
				int[] c = new int[m];
				for (int i=0;i<m;i++){
					c[i] = sc.nextInt();
				}
				
				int[] dp = new int[256];
				Arrays.fill(dp, Integer.MAX_VALUE);
				dp[128] = 0;
				
				for (int i=0;i<n;i++){
					int xx = sc.nextInt();
					int[] dp2 = new int[256];
					Arrays.fill(dp2,Integer.MAX_VALUE);
					for (int j=0;j<256;j++){
						if (dp[j] == Integer.MAX_VALUE){
							continue;
						}
						for (int k=0;k<m;k++){
							int next = j + c[k];
							if (next > 255) {
								next = 255;
							}
							if (next < 0){
								next = 0;
							}
							int x = dp[j] + (next - xx) * (next - xx);
							dp2[next] = Math.min(dp2[next], x);
						}
					}
					dp = dp2;
				}
				
				int min = Integer.MAX_VALUE;
				for (int v : dp) {
					min = Math.min(min,v);
				}
				System.out.println(min);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}