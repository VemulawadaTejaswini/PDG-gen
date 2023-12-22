import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strarray = str.split(" ");
		for(int i = 0; i < strarray.length; i++) {
			char[] carray = strarray[i].toCharArray();
			for (char c : carray) {
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				} else if (Character.isLowerCase(c)) {
					c = Character.toUpperCase(c);
				}
				System.out.print(c);
			}
			if (i != strarray.length - 1)System.out.print(" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new Main().run();
	}
}