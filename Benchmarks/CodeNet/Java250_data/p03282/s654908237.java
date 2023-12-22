import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextLong();
		boolean flag = true;
		int i = 0;
		int k = 0;
		while (flag&&i<S.length()) {
			if (S.charAt(i) == '1') {
				i++;
			} else {
				flag = false;
				k = Integer.parseInt("" + S.charAt(i));
			}
		}
		if (K < i + 1) {
			System.out.println(1);
		} else {
			System.out.println(k);
		}

	}

}