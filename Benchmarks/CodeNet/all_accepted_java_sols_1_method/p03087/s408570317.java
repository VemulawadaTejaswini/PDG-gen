import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		String s = sc.next();
		int psa[] = new int[s.length() + 1];
		for (int i = 1; i < s.length(); i++) {
			psa[i] = psa[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
		}
		psa[psa.length - 1] = psa[psa.length - 2];

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(psa[r - 1] - psa[l - 1]);
		}
	}

}
