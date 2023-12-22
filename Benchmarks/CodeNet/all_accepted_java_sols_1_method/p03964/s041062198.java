import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = 1L;
		long b = 1L;
		for(int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long a_x = a/x;
			long b_y = b/y;
			a_x += (a%x==0) ? 0 : 1;
			b_y += (b%y==0) ? 0 : 1;
			long t = Math.max(a_x, b_y);
			a = t*x;
			b = t*y;
		}
		System.out.println(a+b);
	}
}