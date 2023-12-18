
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		
		if(x < 0) {
			x *= -1;
		}
		long p = x/d;
		if(p == 0) {
			long m = d-x;
			k--;
			if(k % 2 ==0) {
				System.out.println(m);
			}
			else {
				System.out.println(d-m);
			}
			return;
		}
		
		if(p >= k) {
			System.out.println(x-d*k);
			return ;
		}
		
		long l;
		
		if(Math.abs(x - d*(p+1)) <= x-d*p) {
			k -= p+1;
			l = Math.abs(x-d*(p+1));
		}
		else {
			k -= p;
			l = x-d*p;
		}
		
		if(k % 2 == 0) {
			System.out.println(l);
		}
		else {
			System.out.println(d-l);
		}
		
		}
			
}