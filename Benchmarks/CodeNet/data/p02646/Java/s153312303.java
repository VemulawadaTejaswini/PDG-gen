import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int V = scanner.nextInt();
		int B = scanner.nextInt();
		int W = scanner.nextInt();
		int T = scanner.nextInt();

		int A_after;
		int B_after;


		if (V != 1) {
			A_after = A + (V * T) -1;
		} else {
			A_after = A + (V * T) -1;
		}


		if (W != 1) {
			B_after = B + (W * T) -1;
		} else {
			B_after = B + (W * T);
		}

		if (A_after == B_after) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
