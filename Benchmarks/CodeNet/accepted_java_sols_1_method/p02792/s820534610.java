import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k,l;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		int[][] nc = new int[10][10];
		for (i = 1; i <= 9; i++) {
			if(i<=n) {
				nc[i][i]++;
			}
		}
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				for (k = 1; k <= 200000; k*=10) {
					for (l = 0; l < k; l++) {
						if(i * 10 *k + l*10 + j<=n) {
							nc[i][j]++;
						}
					}
				}
			}
		}
//		out.println(Arrays.deepToString(nc));
		int cnt=0;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				cnt+=nc[i][j]*nc[j][i];
			}
		}
		out.println(cnt);
	}
}
