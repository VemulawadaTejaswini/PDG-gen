import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		sc.close();

		String message = "";

		if(num1 < num2) {
			message = "a < b";
		} else if(num1 > num2) {
			message = "a > b";
		} else if(num1 == num2) {
			message = "a == b";
		}

		System.out.println(message);

	}

}
