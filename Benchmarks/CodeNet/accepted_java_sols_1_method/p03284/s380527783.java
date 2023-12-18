
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		if (N % K == 0) {
			System.out.print(0);
		} else {
			System.out.print(1);
		}
	}
}