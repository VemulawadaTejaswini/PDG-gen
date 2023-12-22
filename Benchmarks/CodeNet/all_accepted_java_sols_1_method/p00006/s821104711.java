import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while ((scan.hasNext())) {
			str = String.valueOf(scan.next());
			char[] chars = str.toCharArray();
			for (int i = chars.length - 1; i >= 0; i--) {
				System.out.print(chars[i]);
			}
			System.out.println();
		}
	}
}