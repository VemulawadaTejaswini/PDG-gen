import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		boolean b = true;
		int cnt = 0;

		if ((S.length() == A + B + 1) && (S.charAt(A) == '-')) {
			for (int i = 0; i < S.length(); i++) {
				if (!(S.charAt(0) == '-') || !(S.charAt(S.length() - 1) == '-')) {
					if (!(S.charAt(i) == '-')) {
						if ((S.charAt(i) < 0) || (S.charAt(i) < 10)) {
							b = false;
						}
					} else {
						cnt++;
						if (cnt != 1) {
							b = false;
							break;
						}
					}
				} else {
					b = false;
					break;
				}
			}
		} else {
			b = false;
		}

		if (b == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
