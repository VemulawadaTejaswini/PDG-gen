import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n+2];
		for (i = 1; i <= n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		a[0]=a[n+1]=0;
		int sum=0;
		int[] b = new int[n+1];
		int[] c = new int[n];
		for (i = 0; i < n; i++) {
			b[i] = abs(a[i+1]-a[i]);
			sum+=b[i];
			c[i] = abs(a[i+2]-a[i]);
		}
		b[i] = abs(a[i+1]-a[i]);
		sum+=b[i];
		PrintWriter pw = new PrintWriter(out);
		for(i = 0; i < n; i++) {
			pw.println(sum-b[i]-b[i+1]+c[i]);
		}
		pw.flush();
	}
}
