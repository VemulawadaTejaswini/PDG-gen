import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long n = stdIn.nextLong();
		
		long a = stdIn.nextLong();
		
		long b = stdIn.nextLong();
		
		long c = a+b;
		
		long d = n/c; 
		
		long ans = 0;
		
		ans += d*a;
		
		if(n-(c*d) <= a) {
			ans += n-(c*d);
		}else {
			ans += a;
		}
		
		System.out.println(ans);
	}

}
