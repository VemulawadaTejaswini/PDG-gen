import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if ((N % 10) == 7 || ((N / 10) % 10) == 7 || (N / 100) == 7) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
