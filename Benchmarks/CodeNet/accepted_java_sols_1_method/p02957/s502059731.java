import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		int dif = A - B;
		if (dif < 0) {
			dif = dif * -1;
		}

		if (dif % 2 != 0) {
			System.out.println("IMPOSSIBLE");
		} else if (A < B) {
			System.out.println(B - (dif / 2));
		} else {
			System.out.println(A - (dif / 2));
		}
	}

}
