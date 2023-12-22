
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int count = 0;

		for (int i = 1; i <= n.length(); i++) {
			count += Integer.parseInt(n.substring(i-1, i));
		}

		if (count % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}