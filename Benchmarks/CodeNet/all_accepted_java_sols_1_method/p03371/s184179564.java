import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int A = reader.nextInt();
		int B = reader.nextInt();
		int C = reader.nextInt();
		int X = reader.nextInt();
		int Y = reader.nextInt();
		int ans = 0;
		boolean isCheaperThanAB = A + B > C * 2;
		boolean isCheaperThanA = A > C * 2;
		boolean isCheaperThanB = B > C * 2;

		if (isCheaperThanAB) {
			int num = Math.min(X, Y);
			ans += num * 2 * C;
			X -= num;
			Y -= num;
		}
		if (isCheaperThanA) {
			ans += X * C * 2;
			X = 0;
		}
		if (isCheaperThanB) {
			ans += Y * C * 2;
			Y = 0;
		}
		ans += X * A;
		ans += Y * B;

		reader.close();
		System.out.print(ans);
	}
}

