import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] chars = s.nextLine().toCharArray();
		for (int i = 0; i < chars.length; ++i) {
			if (Character.isUpperCase(chars[i])) {
				chars[i] = Character.toLowerCase(chars[i]);
			} else {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		System.out.println(String.valueOf(chars));
	}
}