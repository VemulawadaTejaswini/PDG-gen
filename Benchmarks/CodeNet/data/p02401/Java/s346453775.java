import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.nextLine();
while(true){
		if (op.equals("+")) {
			System.out.println(a + b);
		} else if (op.equals("-")) {
			System.out.println(a - b);
		} else if (op.equals("*")) {
			System.out.println(a * b);
		} else if (op.equals("/")) {
			System.out.println(a / b);
		} else {
		break;
		}
}
	}
}
