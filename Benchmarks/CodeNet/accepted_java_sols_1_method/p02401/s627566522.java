import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] arr = null;
		int a;
		int b;

		do {
			str = sc.nextLine();
			arr = str.split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[2]);

			if (arr[1].equals("?")) {
				break;
			} else {
				switch (arr[1]) {
				case "+": {
					System.out.println(a + b);
					break;
				}
				case "-": {
					System.out.println(a - b);
					break;
				}
				case "*": {
					System.out.println(a * b);
					break;
				}
				case "/": {
					System.out.println(a / b);
					break;
				}
				}
			}
		} while (!arr[1].equals("?"));
		sc.close();
	}
}

