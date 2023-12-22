import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int X = scan.nextInt();
		for (int i = X - K + 1; i <= X + K - 1; i++) {
			System.out.print(i + " ");
		}
	}
}
