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
		int[] a = new int[m];
		int[] b = new int[m];
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
		for (i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		for (i = 0; i < m; i++) {
			a[i] = parseInt(sc.next());
			b[i] = parseInt(sc.next());
			list.get(a[i]).add(b[i]);
			list.get(b[i]).add(a[i]);
		}
		sc.close();
		int[] ans = new int[n+1];
		ans[1] = -1;
		HashSet<Integer> set = new HashSet<>();
//		HashSet<Integer> setsumi = new HashSet<>();
		set.add(1);
//		setsumi.add(1);
		while(!set.isEmpty()) {
			HashSet<Integer> settmp = new HashSet<>();
			for (Integer ii : set) {
				ArrayList<Integer> ll = list.get(ii);
//				out.println(ll.toString());
				for (Integer jj : ll) {
					if(ans[jj]==0) {
						ans[jj] = ii;
						settmp.add(jj);
					}
//					out.println(Arrays.toString(ans));
				}
			}
//			setsumi.addAll(settmp);
			set=settmp;
		}
//		out.println(Arrays.toString(ans));
		int cnt=0;
		for(i = 1; i <= n; i++) {
			if(ans[i]!=0)cnt++;
		}
		if(cnt!=n) {
			out.println("No");
		} else {
			out.println("Yes");
			PrintWriter pw = new PrintWriter(System.out);
			for(i = 2; i <= n; i++) {
				pw.println(ans[i]);
			}
			pw.flush();
		}
	}
}
