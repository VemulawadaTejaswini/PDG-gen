
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		char[] s = tmp[0].toCharArray();
		char[] t = tmp[1].toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++){

			sb.append(s[i]);
			sb.append(t[i]);

		}

		System.out.println(sb.toString());
	}
}