import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long S = scanner.nextLong();
		long X1 = (S + 999999999) / 1000000000, X2 = X1 * 1000000000 - S;
		System.out.print(X1 + " 1 " + X2 + " 1000000000 0 0");
	}
}