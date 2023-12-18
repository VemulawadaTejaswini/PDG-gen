import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt("" + s.charAt(i));
		}

		System.out.println(Integer.parseInt(s) % sum == 0 ? "Yes" : "No");

		sc.close();
	}
}
