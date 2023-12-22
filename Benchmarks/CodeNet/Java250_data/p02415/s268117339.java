import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String ins = scan.nextLine();

		for (int i = 0; i < ins.length(); i++)
			System.out.print(revCap(ins.charAt(i)));

		System.out.println();

		System.exit(0);
	}

	private static char revCap(char in) {
		if (in >= 'a' && in <= 'z')
			return (char) (in - 'a' + 'A');
		if (in >= 'A' && in <= 'Z')
			return (char) (in - 'A' + 'a');
		return in;
	}

}