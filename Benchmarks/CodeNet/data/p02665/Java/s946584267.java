
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long []a = new long [n+1];
		long node = 0L;
		
		for(int i = 0 ; i <= n ;i++) {
			a[i] = Long.parseLong(sc.next());
			node += a[i];
		}
		
		long []b = new long[n+1];
		b[0] = 1L;
		long sum = 1L;
		
		for(int i = 0 ; i < n ;i++) {
			if(b[i] <= a[i]) {
				System.out.println(-1);
				return;
			}			
			node -= a[i];
			b[i+1] = Math.min(node, (b[i] - a[i])*2L);
			sum += b[i+1];
		}
		if(node != a[n]) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		
	}
}
