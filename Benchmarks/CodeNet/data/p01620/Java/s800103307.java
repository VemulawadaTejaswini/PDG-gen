import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			int key[] = new int[n];
			for (int i = 0; i < n; i++) {
				key[i] = sc.nextInt();
			}
			char st[] = sc.next().toCharArray();
			String ans = "";
			int index = 0;
			for (int i = 0; i < st.length; i++) {
				int c = st[i] - key[index++ % n];
				if (c < 65) {
					int diff = 65 - c;
					c = 123 - diff;
				}
				if (c > 90 && c < 97) {
					c -= 6;
				}
				ans += (char) c;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}