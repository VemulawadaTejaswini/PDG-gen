import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sep = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(sep);
		String str = sc.next();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isUpperCase(charArray[i])) {
				charArray[i] = Character.toLowerCase(charArray[i]);
			} else {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		for (char ch : charArray) {
			System.out.print(ch);
		}
		System.out.println();

	}

}