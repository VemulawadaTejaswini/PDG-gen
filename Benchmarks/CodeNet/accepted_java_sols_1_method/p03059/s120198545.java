import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int T = scanner.nextInt();
		scanner.close();

		System.out.println(T/A *B);
	}

}
