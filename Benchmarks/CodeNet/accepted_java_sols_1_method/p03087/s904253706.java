public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		int s[] = new int[N];
		boolean b = false;
		int x = 0;
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if (c == 'A') {
				s[i] = x;
				b = true;
			} else if (b && (c == 'C')) {
				x += 1;
				s[i] = x;
				b = false;
			} else {
				s[i] = x;
				b = false;
			}
		}

		int l = 0;
		int r = 0;

		for (int i = 0; i < Q; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			System.out.println(s[r - 1] - s[l - 1]);
		}

	}
}
