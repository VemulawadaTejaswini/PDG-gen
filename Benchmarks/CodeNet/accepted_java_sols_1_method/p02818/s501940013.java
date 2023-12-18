import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

		long aa = a - k;
		if (aa < 0) aa = 0;
		k -= a;
		if (k > 0) {
			b -= k;
			if (b < 0) b = 0;
		}
		System.out.println(aa + " " + b);
	}
}
