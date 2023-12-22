
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nn = sc.nextInt();
		
		long a[] = new long [nn+1];
		long b[] = new long [nn];
		
		long c[] = new long[nn];
		for (int i = 0 ; i < nn+1 ; i ++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0 ; i < nn ; i ++) {
			
			b[i] = sc.nextInt();
		}
		long total = 0;
		for (int n = nn ; n >0 ; n -- ) {
			if (a[n] >= b[n-1]) {
				
				c[n-1] = b[n-1];
				b[n-1] = 0;
			}else {
				c[n-1] = a[n];
				b[n-1] = b[n-1] - a[n];
				if (a[n-1]  >= b[n-1]) {
					c[n-1] += b[n-1];
					a[n-1] = a[n-1] - b[n-1];
				}else {
					
					c[n-1] += a[n-1];
					a[n-1] = 0;
				}
				
			}
			
			total += c[n-1];
		
			
		}
		
		System.out.println(total);
		
	}
}
