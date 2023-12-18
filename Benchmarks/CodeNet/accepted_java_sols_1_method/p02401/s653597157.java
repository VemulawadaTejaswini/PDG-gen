import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String op;
		int count;
		int[] num = new int[20000];
		top: for (count = 0; true; count++) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			switch (op) {
			case "+":
				num[count] = a + b;
				break;
			case "-":
				num[count] = a - b;
				break;
			case "*":
				num[count] = a * b;
				break;
			case "/":
				num[count] = a / b;
				break;
			case "?":
				break top;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
		sc.close();
	}
}
