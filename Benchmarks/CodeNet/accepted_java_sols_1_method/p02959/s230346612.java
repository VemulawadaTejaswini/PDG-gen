import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		long[] b = new long[n + 1];
		
		Arrays.setAll(a, i -> sc.nextLong());
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}
		
		long m = 0;
		for (int i = 0; i < n + 1; i++) {
//			System.out.println("i=" + i);
//			System.out.println("  a=" + a[i]);
//			System.out.println("  b=" + b[i]);
			m += Math.min(a[i], b[i]);
//			System.out.println("  m=" + m);
			
			if (i < n && b[i] > a[i]) {
				long dif = b[i] - a[i];
				m += Math.min(a[i + 1], dif);
				a[i + 1] = Math.max(a[i + 1] - dif, 0);
//				System.out.println("  dif=" + dif);
//				System.out.println("  m=" + m);
			}
		}
		
		System.out.println(m);
	}	
}
