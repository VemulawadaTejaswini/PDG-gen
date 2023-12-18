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
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int ans=0;
		Arrays.parallelSort(a);
		boolean[] af = new boolean[n];
//		Arrays.fill(af, true);
		if(n>=2&&a[0]<a[1])ans++;
		for (i = 1; i < a.length; i++) {
			if(af[i]) continue;
			boolean f=true;
			for (j = 0; j < i; j++) {
				if(a[i]%a[j]==0) {
					af[i]=true;
					f=false;
					break;
				}
			}
			if(f)ans++;
		}
		out.println(ans);
	}
}
