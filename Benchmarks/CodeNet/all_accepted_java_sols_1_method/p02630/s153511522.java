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
		long sum=0;
		HashMap<Long, Integer> map = new HashMap<>();
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			if(map.get(a[i])==null) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i])+1);
			}
			sum+=a[i];
		}
		int q = parseInt(sc.next());
		long[] b = new long[q];
		long[] c = new long[q];
		for (i = 0; i < q; i++) {
			b[i] = parseLong(sc.next());
			c[i] = parseLong(sc.next());
		}
		sc.close();
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < q; i++) {
			if(map.get(b[i])!=null) {
				sum-=b[i]*map.get(b[i]);
				sum+=c[i]*map.get(b[i]);
				if(map.get(c[i])==null) {
					map.put(c[i], map.get(b[i]));
				} else {
					map.put(c[i], map.get(c[i])+map.get(b[i]));
				}
				map.put(b[i], map.get(0));
			}
			pw.println(sum);
		}
		pw.flush();
	}
}
