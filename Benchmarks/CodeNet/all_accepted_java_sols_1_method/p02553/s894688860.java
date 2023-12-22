import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = Math.max(a,b) * Math.max(c, d);
		long f = Math.max(a,b) * Math.min(c, d);
		long g = Math.min(a,b) * Math.max(c, d);
		long h = Math.min(a,b) * Math.min(c, d);
		System.out.println(Math.max(Math.max(e,f),Math.max(g, h)));

	}

}
