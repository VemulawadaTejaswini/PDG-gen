import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		long d = scanner.nextLong();
		
		scanner.close();
		
		if (b <= 0 && d <= 0) {
			System.out.println(a * c);
		} else if (b <= 0 && 0 <= d) {
			System.out.println(b * c);
		} else if (0 <= b && d <= 0) {
			System.out.println(a * d);
		} else {
			System.out.println(b * d);
		}
	}
}
