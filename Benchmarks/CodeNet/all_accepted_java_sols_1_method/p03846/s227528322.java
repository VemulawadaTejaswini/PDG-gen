import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		boolean f = true;
		int c=0;
		if(n%2==0) {
			c = 1;
			for (i = 0; i < n; i+=2) {
				if(a[i]!=c||a[i+1]!=c) {
					f=false;
					break;
				}
				c+=2;
			}
		} else {
			c = 0;
			if(a[0]!=c) {
				f=false;
			}
			if(f) {
				c+=2;
				for (i = 1; i < n; i+=2) {
					if(a[i]!=c||a[i+1]!=c) {
						f=false;
						break;
					}
					c+=2;
				}
			}
		}
		long ans = 0;
		if(f) {
			ans = 1;
			for (i = 0; i < n/2; i++) {
				ans*=2;
				if(ans>=MOD) {
					ans-=MOD;
				}
			}
		}
		out.println(ans);
	}
}
