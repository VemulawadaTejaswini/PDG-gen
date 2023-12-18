import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int a = 255*255*20000;
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n+m == 0) break;
				
				int[] x = new int[n];
				int[] c = new int[m];
				for(int i=0; i<m; i++) {
					c[i] = sc.nextInt();
				}
				for(int i=0; i<n; i++) {
					x[i] = sc.nextInt();
				}
				
				int[] dp = new int[256];
				Arrays.fill(dp, a);
				dp[128] = 0;
				for(int i=0; i<n; i++) {
					int[] next = new int[256];
					Arrays.fill(next, a);
					for(int y=0; y<256; y++) {
						if(dp[y] != a) break;
						for(int j=0; j<m; j++) {
							int nx = y + c[j];
							if(nx < 0) nx = 0;
							if(255 < nx) nx = 255;
							int z = dp[y] + (x[i]-nx) * (x[i]-nx);
							next[nx] = Math.min(next[nx], z);
						}
					}
					dp = next;
				}
				int min = a;
				for(int i=0; i<256; i++) {
					min = Math.min(min, dp[i]);
				}
				System.out.println(min);
			}
		}
	}
}

