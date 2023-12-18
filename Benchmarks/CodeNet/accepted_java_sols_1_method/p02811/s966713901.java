import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int K = sc.nextInt();

		if (500*X >= K) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}