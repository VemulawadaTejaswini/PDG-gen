import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (boolean p = true; p;) {
			int a = sc.nextInt();
			switch (sc.next()) {
			case "+":
				System.out.println(a + sc.nextInt());
				break;
			case "-":
				System.out.println(a - sc.nextInt());
				break;
			case "*":
				System.out.println(a * sc.nextInt());
				break;
			case "/":
				System.out.println(a / sc.nextInt());
				break;
			case "?":
				p = false;
				break;
			}
		}
	}
}