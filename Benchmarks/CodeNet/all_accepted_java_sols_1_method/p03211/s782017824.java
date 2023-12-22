import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int max = Integer.MAX_VALUE;
		int subS = 0;

		for (int i = 0; i < S.length() - 2; i++) {
			subS = Integer.valueOf(S.substring(i, i + 3));
			if (Math.abs(753 - subS) < max) max = Math.abs(753 - subS);
		}

		System.out.println(max);
	}
}
