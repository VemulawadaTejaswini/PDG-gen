
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if (num3 % i == 0)
				count++;
		}
		System.out.println(count);
	}
}