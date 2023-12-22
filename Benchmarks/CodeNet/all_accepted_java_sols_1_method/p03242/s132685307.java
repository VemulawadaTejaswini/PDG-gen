import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		for (int i = 0; i < n.length(); ++i) {
			if (n.charAt(i) == '1') {
				System.out.print('9');
			} else {
				System.out.print('1');
			}
		}
		System.out.println("");
		in.close();
	}
}