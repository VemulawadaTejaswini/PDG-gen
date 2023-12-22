import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int R = scanner.nextInt();
		int ans = Math.min(P + Q, Math.min(P + R, Q + R));
		System.out.println(ans);
		scanner.close();
	}
}