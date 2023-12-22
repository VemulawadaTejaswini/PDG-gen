import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abcd = sc.nextInt();
		int a = abcd / 1000;
		int b = abcd / 100 % 10;
		int c = abcd / 10 % 10;
		int d = abcd % 10;
		boolean op1, op2, op3;
		if (a + b + c + d == 7) {
			op1 = op2 = op3 = true;
		} else if (a + b + c - d == 7) {
			op1 = op2 = true;
			op3 = false;
		} else if (a + b - c + d == 7) {
			op1 = op3 = true;
			op2 = false;
		} else if (a + b - c - d == 7) {
			op1 = true;
			op2 = op3 = false;
		} else if (a - b + c + d == 7) {
			op1 = false;
			op2 = op3 = true;
		} else if (a - b + c - d == 7) {
			op1 = op3 = false;
			op2 = true;
		} else if (a - b - c + d == 7) {
			op1 = op2 = false;
			op3 = true;
		} else {
			op1 = op2 = op3 = false;
		}

		System.out.println(a + (op1 ? "+" : "-")
				+ b + (op2 ? "+" : "-")
				+ c + (op3 ? "+" : "-")
				+ d + "=7");

		sc.close();
	}

}
