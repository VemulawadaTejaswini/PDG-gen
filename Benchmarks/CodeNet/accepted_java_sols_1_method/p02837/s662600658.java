
import java.util.Scanner;

public class Main {

	public static int[][] ask;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ask = new int[n + 1][n + 1];
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < n + 1; j++) {
				ask[i][j] = -1;
			}
		}
		for(int i = 1; i < n + 1; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < a; j++) {
				int b = sc.nextInt();
				ask[i][b] = sc.nextInt();
			}
		}
		int ans = 0;
		for(long i = 0; i < Math.pow(2, n); i++) {
			int[] calc = new int[n + 1];
			long tmp = i;
			for(int j = 1; j < n + 1; j++) {
				if((tmp & 1) == 1) {
					calc[j] = 1;
				} else {
					calc[j] = 0;
				}
				tmp /= 2;
			}
			boolean btmp = true;
			for(int j = 1; j < n + 1; j++) {
				if(calc[j] == 1) {
					for(int k = 1; k < n + 1; k++) {
						if(ask[j][k] != -1 && ask[j][k] != calc[k]) {
							btmp = false;
							break;
						}
					}
				}
			}
			if(btmp) {
				int atmp = 0;
				for(int j = 1; j < n + 1; j++) {
					if(calc[j] == 1)
						atmp++;
				}
				ans = Math.max(ans, atmp);
			}
		}
		System.out.println(ans);

	}

}
