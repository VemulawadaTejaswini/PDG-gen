import java.util.Scanner;

public class Main {
	public static void main(String[] args) n{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		long result = 0;
		for(int i = 1; i <= number; i++) {
			int temporal = number / i;
			result += temporal * (temporal + 1) / 2 * i;
		}
		System.out.println(result);
	}
}
