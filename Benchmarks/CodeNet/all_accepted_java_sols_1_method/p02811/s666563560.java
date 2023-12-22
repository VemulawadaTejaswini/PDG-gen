import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();

		if (500 * K < X) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
