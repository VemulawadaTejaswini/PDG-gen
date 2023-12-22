import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		int L = S.length();
		int zero = 0;
		int one = 0;
		char mozi;
		for (int i = 0; i < L; i++) {
			mozi = S.charAt(i);
			if ((i % 2 == 0 && String.valueOf(mozi).equals("0")) || (i % 2 != 0 && String.valueOf(mozi).equals("1"))) {
				zero++;
			}
			if ((i % 2 == 0 && String.valueOf(mozi).equals("1")) || (i % 2 != 0 && String.valueOf(mozi).equals("0"))) {
				one++;
			}
		}
		if (zero > one)
			System.out.println(L - zero);
		else
			System.out.println(L - one);
	}
}
