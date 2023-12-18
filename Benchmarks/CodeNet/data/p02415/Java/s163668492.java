import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strarray = str.split(" ");
		for(String s : strarray) {
			char[] carray = s.toCharArray();
			for (char c : carray) {
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				} else if (Character.isLowerCase(c)) {
					c = Character.toUpperCase(c);
				}
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}