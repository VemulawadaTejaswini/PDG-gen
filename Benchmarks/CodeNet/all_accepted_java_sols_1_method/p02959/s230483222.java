import java.util.*;

public class Main {
    public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];
		long count = 0;
		
		for (int i = 0; i<n+1; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(a[i] < b[i]) {
				count += a[i];
				b[i] -= a[i];
				if(b[i] > a[i+1]) {
					count += a[i+1];
					a[i+1] = 0;
				} else {
					count += b[i];
					a[i+1] -= b[i];
				}
			} else {
				count += b[i];
			}
		}
		System.out.println(count);
	}
}