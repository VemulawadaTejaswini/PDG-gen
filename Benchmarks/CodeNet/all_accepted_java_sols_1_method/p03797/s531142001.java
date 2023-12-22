import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if(2 * n <= m) {
			System.out.println(n + (m - n * 2) / 4);
		} else {
			System.out.println(m / 2);
		}
	}
}
