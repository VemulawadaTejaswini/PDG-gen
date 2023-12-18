import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int min = 200;

		if (min >= P + Q) {
			min = P + Q;
		}

		if (min >= P + R) {
			min = P + R;
		}

		if (min >= Q + R) {
			min = Q + R;
		}

		System.out.print(min);
	}
}
