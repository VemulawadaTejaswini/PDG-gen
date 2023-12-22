import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		String s = sc.next();
		int ac[] = new int[s.length() + 1];
		for (int i = 1; i < s.length(); i++) {
			ac[i] = s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0;
		}
		int psa[] = new int[s.length() + 1];
		for (int i = 1; i <= s.length(); i++) {
			psa[i] = psa[i - 1] + ac[i];
		}

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(psa[r - 1] - psa[l - 1]);
		}
	}

}
