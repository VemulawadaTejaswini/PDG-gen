
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long []a = new long[n];
		long []b = new long[n];
		
		long []c = new long [n];
		long sum = 0;
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
			c[i] = a[i] + b[i];
			sum += b[i];
		}
		
		Arrays.sort(c);
		
		int cnt = 0;
		
		long sum1 = 0;
		for(int i = n-1 ; i >= 0 ;i--) {
			if(cnt % 2 == 0) {
				sum1 += c[i];
			}
			cnt++;
		}
		
		System.out.println(sum1 - sum);
		
	}
}