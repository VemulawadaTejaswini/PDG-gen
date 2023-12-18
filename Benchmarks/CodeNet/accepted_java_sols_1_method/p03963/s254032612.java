import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();
		int numK = scan.nextInt();

		int count = numK;

		for (int i = 1; i < numN; i++) {
			count *= numK - 1;
		}

		System.out.println(count);
	}
}
