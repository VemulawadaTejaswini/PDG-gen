import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int turtle = 0; turtle <= x; ++turtle) {
			int crane = x - turtle;
			int feet = 4 * turtle + 2 * crane;
			if (feet == y) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}
