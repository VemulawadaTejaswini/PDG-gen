import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;

		while (scanner.hasNext()) {
			a = scanner.nextInt();
			b = scanner.nextInt();

			System.out.println(new String(String.valueOf(a + b)).length());
		}
	}
}