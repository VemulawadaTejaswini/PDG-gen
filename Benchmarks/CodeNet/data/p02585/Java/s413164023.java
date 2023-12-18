import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		long[] c = new long[n];
		
		Arrays.setAll(p, i -> sc.nextInt() - 1);
		Arrays.setAll(c, i -> sc.nextLong());
		
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			long sum = 0;
			int t = k;
			int idx = p[i];
			while (t > 0) {
				sum += c[idx];
				idx = p[idx];
				t--;
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
	
	
}


