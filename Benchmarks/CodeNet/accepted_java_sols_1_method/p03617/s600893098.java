import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.next());
		int h = Math.min(Integer.parseInt(sc.next()), q * 2);
		int s = Math.min(Integer.parseInt(sc.next()), h * 2);
		int d = Integer.parseInt(sc.next());
		long n = Integer.parseInt(sc.next());
		if (s * 2 <= d) {
			System.out.println(s * n);
		}
		else if (n % 2 == 0) {
			System.out.println(d * n / 2);
		}
		else {
			System.out.println(d * (n / 2) + s);
		}
	}
}