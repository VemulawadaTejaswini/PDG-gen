import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a1 = new long[n];
		long[] a2 = new long[n];
		for(i=0;i<n;i++) {
			a1[i] = parseLong(sc.next());
		}
		for(i=0;i<n;i++) {
			a2[i] = parseLong(sc.next());
		}
		sc.close();
		long[] b1 = new long[n];
		long[] b2 = new long[n];
		b1[0] = a1[0];
		b2[n-1] = a2[n-1];
		for(i=1;i<n;i++) {
			b1[i] = a1[i]+b1[i-1];
			b2[n-1-i] = a2[n-1-i]+b2[n-i];
		}
		long mx=0;
		long b12=0;
		for(i=0;i<n;i++) {
			b12 = b1[i] + b2[i];
			if(b12 > mx) mx = b12;
		}
		out.println(mx);
	}
}
