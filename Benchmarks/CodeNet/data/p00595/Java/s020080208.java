import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(GCD(a, b));
		}
	}

	private static int GCD(int a, int b) {
		if (b > a) {
			int t = b;
			b = a;
			a = t;
		}
		
		int r = b % a;
		while (r > 0) {
			b = a;
			a = r;
			r = b % a;
		}
		return a;
	}
}