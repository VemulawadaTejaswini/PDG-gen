import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main (String[] args) {
		// for C
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt ();
		long[] a = new long [N];
		int i;
		for (i=0; i<N; i++)
			a[i] = sc.nextLong ();
		Arrays.sort (a);
		long h=0, w=0;
		for (i=N-1; i>0; i--) {
			if (a[i]==a[i-1]) {
				h = a[i];
				i-=2;
				break;
			}
		}
		for (; i>0; i--) {
			if (a[i]==a[i-1]) {
				w = a[i];
				break;
			}
		}
		System.out.println (h*w);
	}
}