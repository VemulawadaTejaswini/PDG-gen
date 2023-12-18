import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		int ans = 0;
		if(op == "+") {
			ans = a + b;
		} else if(op == "-") {
			ans = a - b;
		} else if(op == "*") {
			ans = a * b;
		} else if(op == "/") {
			ans = a / b;
		} else if(op == "?") {
			System.exit(0);
		}
		System.out.println(ans);
	}
}