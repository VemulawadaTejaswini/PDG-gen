

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next(), t = s.next();
		System.out.println(str1.equals(t.substring(0, t.length() - 1)) ? "Yes" : "No");

	}

}
