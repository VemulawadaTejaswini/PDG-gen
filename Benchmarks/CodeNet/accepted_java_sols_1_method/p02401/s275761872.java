import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		//ArrayList<String> std_list = new ArrayList<String>();
			String std = scanner.nextLine();
			String[] std_list = std.split(" ");
			int a = Integer.parseInt(std_list[0]);
			String op = std_list[1];
			int b = Integer.parseInt(std_list[2]);

			if (op.equals("?")) {
				break;
			}
			else if (op.equals("+")) {
				System.out.println(a + b);
			}
			else if (op.equals("-")) {
				System.out.println(a - b);
			}
			else if (op.equals("*")) {
				System.out.println(a * b);
			}
			else {
				System.out.println(a / b);
			}
		}
	}
}
