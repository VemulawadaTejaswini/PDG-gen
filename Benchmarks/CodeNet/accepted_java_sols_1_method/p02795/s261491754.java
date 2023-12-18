import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		length = Math.max(length, scanner.nextInt());
		int N = scanner.nextInt();
		scanner.close();
		System.out.println((N - 1) / length + 1);

	}

}
