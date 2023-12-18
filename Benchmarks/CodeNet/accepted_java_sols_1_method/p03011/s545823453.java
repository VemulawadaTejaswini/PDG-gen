
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int R = scanner.nextInt();
		int tmp = Math.min(P + Q, P + R);
		int ans = Math.min(tmp, Q + R);
		System.out.println(ans);
		scanner.close();
	}
}