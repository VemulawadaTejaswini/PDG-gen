import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static int n;
	public static int m;
	public static long k;
	public static long[] a;
	public static long[] b;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		n = parseInt(sc.next());
		m = parseInt(sc.next());
		k = parseLong(sc.next());
		a = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
		}
		b = new long[m];
		for (i = 0; i < m; i++) {
			b[i] = parseLong(sc.next());
		}
		sc.close();
//		out.println(Arrays.toString(a));
		long ans=0;
		long cnt=0;
		long tot=0;
		i=0;
		j=0;
		while(tot<=k&&i<n) {
			tot+=a[i];
			i++;
			cnt++;
		}
		if(tot>k) {
			cnt--;
			i--;
			tot-=a[i];
		}
		ans=cnt;
		j=0;
		for ( i--;  ; i--) {
			while(tot<=k&&j<m) {
				tot+=b[j];
				j++;
				cnt++;
			}
			if(tot>k) {
				cnt--;
				j--;
				tot-=b[j];
			}
			ans=Math.max(ans, cnt);
			if(i<0) break;
			cnt--;
			tot-=a[i];
		}
		out.println(ans);
			
//			if(a[i]<b[j]) {
//				tot+=a[i];
//				i++;
//			} else if(a[i]>b[j]){
//				tot+=b[j];
//				j++;
//			} else {
//				tot+=a[i];
//				i++;
//				if(tot<=k) {
//					tot+=b[j];
//					j++;
//					ans++;
//				}
//			}
//			ans++;
//		}
//		if(tot<=k) {
//			if(i>=n) {
//				while(tot<=k&&j<m) {
//					tot+=b[j];
//					j++;
//					ans++;
//				}
//			} else if(j>=m) {
//				while(tot<=k&&i<n) {
//					tot+=a[i];
//					i++;
//					ans++;
//				}
//			}
//		}
//		if(tot>k) {
//			ans--;
//		}
//		out.println(ans);
//		out.println(b2(0, 0, 0, 0));
//	}
//	public static int b2(long tot, int i, int j, int cnt) {
////		out.printf("%d,%d,%d,%d%n", tot, i , j , cnt);
//		if(tot>k) return cnt-1;
//		if(i==n&&j==m) return cnt;
//		int aa=0;
//		int bb=0;
//		if(i<n) {
//			aa = b2(tot+a[i], i+1, j, cnt+1);
//		}
//		if(j<m) {
//			bb = b2(tot+b[j], i, j + 1, cnt+1);
//		}
////		out.println(aa);
////		out.println(bb);
//		return Math.max(aa, bb);
	}
}
