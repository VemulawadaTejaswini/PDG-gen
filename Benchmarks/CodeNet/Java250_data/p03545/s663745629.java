import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		int a = Integer.valueOf(s.substring(0, 1));
		int b = Integer.valueOf(s.substring(1, 2));
		int c = Integer.valueOf(s.substring(2, 3));
		int d = Integer.valueOf(s.substring(3, 4));
		String op1 = "", op2 = "", op3 = "";
		
		if ((a + b + c + d) == 7) {
			op1 = "+";
			op2 = "+";
			op3 = "+";
		} else if ((a + b + c - d) == 7) {
			op1 = "+";
			op2 = "+";
			op3 = "-";
		} else if ((a + b - c + d) == 7) {
			op1 = "+";
			op2 = "-";
			op3 = "+";
		} else if ((a - b + c + d) == 7) {
			op1 = "-";
			op2 = "+";
			op3 = "+";
		} else if ((a + b - c - d) == 7) {
			op1 = "+";
			op2 = "-";
			op3 = "-";
		} else if ((a - b + c - d) == 7) {
			op1 = "-";
			op2 = "+";
			op3 = "-";
		} else if ((a - b - c + d) == 7) {
			op1 = "-";
			op2 = "-";
			op3 = "+";
		} else {
			op1 = "-";
			op2 = "-";
			op3 = "-";
		}
		
		System.out.println(a+op1+b+op2+c+op3+d+"=7");

		sc.close();
	}
}
