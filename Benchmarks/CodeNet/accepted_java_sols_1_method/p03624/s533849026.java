import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char[] c = s.toCharArray();

		Arrays.sort(c);

		char min = 97;
		for (int i = 0; i < s.length(); i++) {
			if ((int)c[i] == min) min++;
		}

		if (min == '{') {
			System.out.println("None");
		} else {
			System.out.println(min);
		}

		sc.close();
	}

}
