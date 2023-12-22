import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char[] c = s.toCharArray();

		Arrays.sort(c);

		boolean can = false;
		for (int i = 0; i < s.length() - 1; i++) {
			if (c[i] == c[i + 1]) can = true;
		}

		if (can) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}

		sc.close();
	}

}
