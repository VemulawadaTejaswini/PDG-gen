
public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		int num1 = Integer.parseInt(str1[0]);
		int num2 = Integer.parseInt(str1[2]);

		while (true) {

			if (str1[1] == "?") {
				break;
			}

			switch (str1[1]) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			}
		}
		sc.close();

	}

}

