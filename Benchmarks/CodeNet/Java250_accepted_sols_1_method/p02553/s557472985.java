import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long x1 = a*c;
		long x2 = a*d;
		long x3 = b*c;
		long x4 = b*d;

		long ans = Math.max(x1,x2);
		ans=Math.max(ans, x3);
		ans=Math.max(ans, x4);
			System.out.println(ans);
		
	}
}