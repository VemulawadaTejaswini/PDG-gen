import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int add = A + B;
		int sub = A - B;
		int mul = A * B;
		int max = Math.max(add, sub);
		max = Math.max(max, mul);
		System.out.println(max);
		scanner.close();
	}
}