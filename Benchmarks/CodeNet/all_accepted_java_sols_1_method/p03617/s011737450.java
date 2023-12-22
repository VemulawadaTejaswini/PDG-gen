import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long h = sc.nextLong();
		long s = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		
		h = Math.min(2 * q, h);
		s = Math.min(2 * h, s);
		d = Math.min(2 * s, d);
		
		long ans = (n / 2) * d + (n % 2) * s;
		System.out.println(ans);
		
		sc.close();
	}
	
}

