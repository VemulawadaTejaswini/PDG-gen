import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			String s = scanner.next();
			int b = scanner.nextInt();
			int result = 0;
			boolean end = false;
			switch (s) {
				case "+" :
					result = a + b;
					break;
				case "-" :
					result = a - b;
					break;
				case "*" :
					result = a * b;
					break;
				case "/" :
					result = a / b;
					break;
				default :
					end = true;
					break;
			}
			if (end)
				break;
			System.out.println(result);
		}
		scanner.close();
	}
}
