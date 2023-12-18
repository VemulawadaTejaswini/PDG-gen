import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int x = ch - 'A';
			x += n;
			x %= 26;
			ch = (char) ('A' + x);
			System.out.print(ch);
		}
		System.out.println();
	}
}
