import java.util.Scanner;
public class Main {
  
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long n = stdIn.nextLong();
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		
		long c = a + b;
		
		long cnt = n / c;
		
		long ans = (n/(a+b))*a;
		
		long rem = n % (a+b);
		
		System.out.println(ans+Math.min(a,rem));
		
	}

}