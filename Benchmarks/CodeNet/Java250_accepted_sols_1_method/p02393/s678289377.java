import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (a < b) {
			num1 = a;
			num2 = b;
		} else {
			num1 = b;
			num2 = a;
		}
		
		int c = in.nextInt();
		if (c < num1) {
			num3 = num2;
			num2 = num1;
			num1 = c;
		} else if (c > num2) {
			num3 = c;
		} else {
			num3 = num2;
			num2 = c;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}
}