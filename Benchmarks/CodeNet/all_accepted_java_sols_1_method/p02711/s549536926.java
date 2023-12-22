import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int f = 0;

		if (N % 10 == 7) {
			f++;
		}
		N /= 10;

		if (N % 10 == 7) {
			f++;
		}
		N /= 10;

		if (N == 7) {
			f++;
		}

		if (f == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}