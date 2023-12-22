import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			int num1 = sc.nextInt();
			String ope = sc.next();
			int num2 = sc.nextInt();

			if(ope.equals("?")) break;

			int ans = 0;
			switch(ope) {
				case "+":
					ans = num1 + num2;
					break;
				case "-":
					ans = num1 - num2;
					break;
				case "/":
					ans = num1 / num2;
					break;
				case "*":
					ans = num1 * num2;
					break;
			}
			System.out.println(ans);
		}

		sc.close();

	}

}
