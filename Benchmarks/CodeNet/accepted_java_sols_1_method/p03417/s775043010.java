import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());
		long o = 2 * n + 2 * (m - 2);
		System.out.println(Math.abs(n * m - o));
	}
}