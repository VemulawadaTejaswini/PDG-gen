
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		int tmp = 0;
		int s = 1;
		boolean t = false;
		for (int i = 0; i < N ;i++) {
			tmp = sc.nextInt();
			if (s == tmp) {
				s++;
				t = true;
			} else {
				cnt++;
			}
		}

		if (t) {
			System.out.print(cnt);
		} else {
			System.out.print(-1);
		}

	}
}
