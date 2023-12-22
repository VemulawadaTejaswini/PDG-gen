import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		char[] chars = S.toCharArray();
		String before = String.valueOf(chars[0]);
		String dummy = "";
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			dummy = dummy.concat(String.valueOf(chars[i]));
			if (!before.equals(dummy)) {
				count++;
				before = dummy;
				dummy = "";
			}
		}
		System.out.println(count);
	}
}
