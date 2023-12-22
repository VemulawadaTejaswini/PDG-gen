import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	static long[] fact;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		double a2 = (double)a[n-1]/2;
		double mn = 1000000000;
		int mnp = 0;
		for (i = 0; i < a.length; i++) {
			if(abs(a[i]-a2) < mn) {
				mn = abs(a[i]-a2);
				mnp = i;
			}
		}
		out.printf("%d %d%n", a[n-1], a[mnp]);
	}
}
