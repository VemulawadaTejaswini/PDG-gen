import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(),b = scanner.nextInt();
		int c = scanner.nextInt(),d = scanner.nextInt();
		System.out.println((int)Math.max(a*b, c*d));
	}

}
