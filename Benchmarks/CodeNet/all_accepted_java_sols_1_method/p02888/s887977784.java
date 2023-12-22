import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] l = new int[n];
		for(i=0;i<n;i++) {
			l[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(l);
//		out.println(Arrays.toString(l));
		long cnt = 0;
		int ks = 2;
		int ke = ks;
		for (i = 0; i < n-2; i++) {
			ks = i +2;
			ke = ks;
			for (j = i+1; j < n-1; j++) {
				if(ks<=j)ks=j+1;
				for (k = j+1; k < n; k++) {
					if(l[j]-l[i] < l[k]) break;
				}
				ks = k;
				if(ke<ks) ke=ks;
				for (k = ke; k < n; k++) {
					if(l[k] >= l[j]+l[i]) break;
				}
				ke = k;
//				out.printf("%d,%d_%d:%d%n",i,j,ks,ke);
				cnt+=ke-ks;
			}
		}
		out.println(cnt);
	}
}
