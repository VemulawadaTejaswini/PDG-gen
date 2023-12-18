
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] J, O, I;
	void run() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		J = new int[m+1][n+1];
		O = new int[m+1][n+1];
		I = new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			String str = sc.next();
			for(int j=1;j<=n;j++) {
				J[i][j] = J[i][j-1] + J[i-1][j] - J[i-1][j-1];
				O[i][j] = O[i][j-1] + O[i-1][j] - O[i-1][j-1];
				I[i][j] = I[i][j-1] + I[i-1][j] - I[i-1][j-1];
				switch ( str.charAt(j-1) ) {
				case 'J': J[i][j]++; break;
				case 'O': O[i][j]++; break;
				case 'I': I[i][j]++; break;
				}
			}
		}
//		for(int[] a: J) debug(a);
//		for(int[] a: O) debug(a);
//		for(int[] a: I) debug(a);
		for(int i=0;i<k;i++) {
			int p[] = new int[4];
			for(int j=0;j<4;j++) p[j] = sc.nextInt();
			int js = J[p[2]][p[3]] - J[p[2]][p[1]-1] - J[p[0]-1][p[3]] + J[p[0]-1][p[1]-1];
			int os = O[p[2]][p[3]] - O[p[2]][p[1]-1] - O[p[0]-1][p[3]] + O[p[0]-1][p[1]-1];
			int is = I[p[2]][p[3]] - I[p[2]][p[1]-1] - I[p[0]-1][p[3]] + I[p[0]-1][p[1]-1];
			System.out.println(js + " " + os + " " + is);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}