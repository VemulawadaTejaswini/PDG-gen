import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char[] charArray = input.toCharArray();
		for (int i = 0; i < 4; i++) {
			System.out.print(charArray[i]);
		}
		System.out.print(" ");
		for (int i = 4; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
	}

}