import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		for(i=0;i<n-1;i++) {
			c[i] = parseInt(sc.next());
			s[i] = parseInt(sc.next());
			f[i] = parseInt(sc.next());
		}
		sc.close();
		int[] a = new int[n];
		for(i=0;i<n-1;i++) {
			for (j = i; j < n-1; j++) {
				if(a[i]<s[j]) {
					a[i]=s[j];
				} else {
					a[i] = (int)ceil((double)(a[i]-s[j])/f[j])*f[j]+s[j];
					
				}
				a[i] += c[j];
			}
		}
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<n;i++) {
			pw.println(a[i]);
		}
		pw.flush();
	}
}
