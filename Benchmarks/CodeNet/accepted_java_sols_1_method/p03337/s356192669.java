import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;

		if (sum < sub) {
			if (sub < mul) {
				System.out.println(mul);
			} else {
				System.out.println(sub);
			}
		} else {
			if (sum < mul) {
				System.out.println(mul);
			} else {
				System.out.println(sum);
			}
		}
	}
}
