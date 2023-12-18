import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int a,b;
		String op;

		Scanner stdIn = new Scanner(System.in);

		a = Integer.parseInt(stdIn.next());
		b = Integer.parseInt(stdIn.next());

		if (a == b) {
			op = " == ";
		} else if (a > b) {
			op = " > ";
		} else {
			op = " < ";
		}

		System.out.println("a" + op + "b");

		stdIn.close();
	}

}