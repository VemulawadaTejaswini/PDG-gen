import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final int MAXNUM = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tetra = new int[200];
		int m = 0;
		for(int i=1;i<200;i++) {
			tetra[i] = i * (i+1) * (i+2) / 6;
			if (tetra[i] > MAXNUM) {
				m = i;
				break;
			}
		}
		int[] dp1 = new int[MAXNUM+1];
		int[] dp2 = new int[MAXNUM+1];
		Arrays.fill(dp1, Integer.MAX_VALUE);
		Arrays.fill(dp2, Integer.MAX_VALUE);
		dp1[0] = dp2[0] = 0;
		for(int i=1;i<=MAXNUM;i++) {
			for(int j=1;j<m;j++) {
				if (i - tetra[j] < 0) {
					break;
				}
				dp1[i] = Math.min(dp1[i],dp1[i-tetra[j]]+1);
				if ((tetra[j]&1)==1) {
					dp2[i] = Math.min(dp2[i],dp2[i-tetra[j]]+1);
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(dp1[n] + " " + dp2[n]);
		}
	}

}