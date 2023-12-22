import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int m = N / 111;
		if (N%111 != 0) {
			m += 1;
		}
		int t = m * 111;
		System.out.println(t);
	}
}
