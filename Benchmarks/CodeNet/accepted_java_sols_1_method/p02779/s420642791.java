import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		for (i = 0; i < a.length; i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		HashSet<Long> set = new HashSet<>(n);
		boolean f=true;
		for (i = 0; i < n; i++) {
			if(set.contains(a[i])) {
				f=false;
				break;
			} else {
				set.add(a[i]);
			}
		}
		out.println(f?"YES":"NO");
	}
}
