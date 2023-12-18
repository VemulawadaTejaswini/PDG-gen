import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals("-"))
				break;
			int m = Integer.parseInt(sc.nextLine());
			int h_sum = 0;
			for (int i = 0; i < m; ++i) {
				h_sum += Integer.parseInt(sc.nextLine());
			}
			h_sum %= str.length();
			for (int i = h_sum; i < str.length(); ++i) {
				System.out.print(str.charAt(i));
			}
			for (int i = 0; i < h_sum; ++i) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}
