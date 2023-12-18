import java.io.Console;

class XCubic {
	public static void main (String[] arg) {
		Console con = System.console();
		String input;
		int a;

		System.out.print("Input integer: ");
		input = con.readLine();

   		a = Integer.parseInt(input);
		if (a < 1 || a > 100) {
			System.out.println("Wrong input");
		} else {
			System.out.println(a * a * a);
		}
	}
}
