import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = 0;
		int count = 0;
		int yesCount = 0;

		Z = X * 2;

		if (Z != Y) {
			for (int i = 0; i < X; i++) {
				Z = Z + 2;
				if (Z == Y) {
					i = i + 1;
					count = i;
					System.out.println("Yes");
					yesCount++;
					break;
				}
			}
		} else if (X * 2 == Y) {
			System.out.println("Yes");
			yesCount++;
		}
		if (yesCount == 0) {
			System.out.println("No");
		}
		//System.out.println(X - (count) + (" ") + (count));
		sc.close();
	}
}
