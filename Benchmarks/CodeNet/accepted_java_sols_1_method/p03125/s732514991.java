import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());

		if (num1 == 1 || num1 == num2) {
			System.out.println(num1 + num2);
		} else {
			if (num1 > num2) {
				if (num1 % num2 == 0) {
					System.out.println(num1 + num2);
				} else {
					System.out.println(num2 - num1);
				}
			} else if (num1 < num2) {
				if (num2 % num1 == 0) {
					System.out.println(num1 + num2);
				} else {
					System.out.println(num2 - num1);
				}
			}
		}
		sc.close();
	}
}