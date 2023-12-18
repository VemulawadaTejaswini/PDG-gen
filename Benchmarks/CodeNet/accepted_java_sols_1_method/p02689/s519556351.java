import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		long[] h = new long[n];
		for (i = 0; i < n; i++) {
			h[i] = parseLong(sc.next());
		}
		int[] a = new int[m];
		int[] b = new int[m];
		for (i = 0; i < m; i++) {
			a[i] = parseInt(sc.next())-1;
			b[i] = parseInt(sc.next())-1;
		}
		sc.close();
		boolean[] f = new boolean[n];
		Arrays.fill(f, true);
		for (i = 0; i < m; i++) {
			if(h[a[i]]<=h[b[i]]) {
				f[a[i]] = false;
			}
			if(h[a[i]]>=h[b[i]]) {
				f[b[i]] = false;
			}
		}
		int ans=0;
//		out.println(Arrays.toString(f));
		for (i = 0; i < n; i++) {
			if(f[i])ans++;
		}
		out.println(ans);
	}
}
