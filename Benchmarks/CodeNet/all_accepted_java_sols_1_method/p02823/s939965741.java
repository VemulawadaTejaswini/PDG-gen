
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		

		
		if ((b-a)%2==0) {
			System.out.println((b-a)/2);
		} else {
			long x = b-1;
			long y = n-a;
			long z = a+(b-a-1)/2;
			long w = n-b+1+(n-(a+n-b+1))/2;
			
			System.out.println(Math.min(Math.min(x, y),Math.min(z, w)));
		}
	}

}
