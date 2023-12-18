import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();

		if (0 <= x - r && x + r <= W && 0 <= y - r && y + r <= H) {
			System.out.println("Yes");

		}
		else 
			System.out.println("No");
	}
}