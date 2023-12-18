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
		long k = parseLong(sc.next());
		long[] a = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
		}
		long[] b = new long[m];
		for (i = 0; i < m; i++) {
			b[i] = parseLong(sc.next());
		}
		sc.close();
//		out.println(Arrays.toString(a));
		long ans=0;
		long tot=0;
		i=0;
		j=0;
		while(tot<=k&&i<n&&j<m) {
			if(a[i]<b[j]) {
				tot+=a[i];
				i++;
			} else if(a[i]>b[j]){
				tot+=b[j];
				j++;
			} else {
				tot+=a[i];
				i++;
				if(tot<=k) {
					tot+=b[j];
					j++;
					ans++;
				}
			}
			ans++;
		}
		if(tot<=k) {
			if(i>=n) {
				while(tot<=k&&j<m) {
					tot+=b[j];
					j++;
					ans++;
				}
			} else if(j>=m) {
				while(tot<=k&&i<n) {
					tot+=a[i];
					i++;
					ans++;
				}
			}
		}
		if(tot>k) {
			ans--;
		}
		out.println(ans);
	}
}
