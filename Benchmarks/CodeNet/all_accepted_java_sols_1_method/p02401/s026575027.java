import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i = 0;
		int[] res = new int[30];
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.next();
			int a = Integer.parseInt(line);
			line = sc.next();
			String ope = line;
			line = sc.next();
			int b = Integer.parseInt(line);

			if (ope.contentEquals("?")) {
				break;
			} else {
				switch (ope) {
				case "+":
					res[i] = a + b;
					break;
				case "-":
					res[i] = a - b;
					break;
				case "*":
					res[i] = a * b;
					break;
				case "/":
					res[i] = a / b;
					break;
				}
				i++;
			}
		}

		for (int j = 0; j < i; j++) {
			System.out.println(res[j]);
		}
	}

}
