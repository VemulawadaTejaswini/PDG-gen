import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		int answer = 0;
		if(op.equals("+")) {
			answer = a + b;
		} else {
			answer = a - b;
		}
		System.out.println(answer);
	}
}