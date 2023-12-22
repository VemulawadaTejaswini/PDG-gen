import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char c[] = S.toCharArray();
		sc.close();
		for (int i = 0; i < S.length(); i++) {
			c[i] += N;
			if (c[i] > 'Z') {
				System.out.print((char) (c[i] - 26));
			} else {
				System.out.print(c[i]);
			}
		}
	}
}
