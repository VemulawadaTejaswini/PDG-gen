import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] a = new int[n+1];
		int[] b = new int[n];
		for(i=0;i<n+1;i++) {
			a[i] = parseInt(sc.next());
		}
		for(i=0;i<n;i++) {
			b[i] = parseInt(sc.next());
		}
		sc.close();
		long sum = 0;
		int m=0;
		for(i=0;i<n;i++) {
			m = Math.min(a[i]+a[i+1],b[i]);
			sum += (long)m;
			a[i+1] = Math.min(a[i]+a[i+1]-m,a[i+1]);
		}
		out.println(sum);
	}
}
