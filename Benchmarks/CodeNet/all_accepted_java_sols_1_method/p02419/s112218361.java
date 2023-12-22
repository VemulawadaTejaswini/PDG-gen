import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		int count = 0;

		for (String T = sc.next(); !(T.equals("END_OF_TEXT")); T = sc.next()) {
			T = T.toLowerCase();
			if (W.equals(T)) {
				count++;
			}
		}
		System.out.println(count);

	}

}

