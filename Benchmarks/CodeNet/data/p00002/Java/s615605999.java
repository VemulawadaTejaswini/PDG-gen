import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		while(scanner.hasNext()) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a == 0 && b == 0) {
				System.out.println(1);
			} else {
				System.out.println((int)Math.floor(Math.log10(a + b)) + 1);
			}
		}
	}
}