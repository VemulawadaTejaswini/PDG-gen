import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		StringBuilder str;
		int q;
		String commandline;

		Scanner stdIn = new Scanner(System.in);

		str = new StringBuilder(stdIn.next());
		q = stdIn.nextInt();

		stdIn.nextLine();

		for (int i = 0; i < q; i++) {
			commandline = stdIn.nextLine();
			String[] command = commandline.split(" +");

			int a = Integer.parseInt(command[1]);
			int b = Integer.parseInt(command[2]) + 1;

			switch (command[0]) {
			case "print":
				print(a, b, str);
				break;
			case "reverse":
				reverse(a, b, str);
				break;
			case "replace":
				replace(a, b, command[3], str);
				break;
			default:

			}
		}
		stdIn.close();
	}

	public static void print(int a, int b, StringBuilder str) {
		System.out.println(str.substring(a, b));
	}

	public static void reverse(int a, int b, StringBuilder str) {
		StringBuilder sb = new StringBuilder(str.substring(a, b));
		str.delete(a, b);
		str.insert(a, sb.reverse().toString());
	}

	public static void replace(int a, int b, String p, StringBuilder str) {
		str.delete(a, b);
		str.insert(a, p);
	}
}