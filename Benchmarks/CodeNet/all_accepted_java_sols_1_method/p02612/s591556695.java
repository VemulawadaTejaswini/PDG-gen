import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (N % 1000 == 0) {
			System.out.println(0);
		} else {
			System.out.println(((N / 1000) + 1) * 1000 - N);
		}

	}

}
