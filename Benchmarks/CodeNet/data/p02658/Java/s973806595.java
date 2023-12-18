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
		long[] a = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		long ans=a[0];
		for (i = 1; i < n; i++) {
			if(ans==0) break;
			if(1000000000000000000L/ans<a[i]) {
				ans=-1;
				break;
			}
			ans*=a[i];
		}
		out.println(ans);
	}
}
