import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] lines = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(lines[0]);
			int num2 = Integer.parseInt(lines[2]);
			int ans = 0;
			if(lines[1].equals("+")) {
				ans = num1 + num2;
			} else if(lines[1].equals("-")) {
				ans = num1 - num2;
			} else if(lines[1].equals("*")) {
				ans = num1 * num2;
			} else if(lines[1].equals("/")) {
				ans = num1 / num2;
			} else {
				break;
			}
			System.out.println(ans);
		}

	}
}