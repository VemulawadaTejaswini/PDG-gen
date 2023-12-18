import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = "qwertasdfgzxcvb".toCharArray();
		int[] hand = new int['Z' - 'A' + 1];
		for(char v: c) {
			hand[v - 'a'] = 1;
		}

		while (true) {
			char[] str = sc.next().toCharArray();
			if (str[0] == '#') {
				break;
			}
			int ans = 0;
			int pre = hand[str[0] - 'a'];
			for (int i = 1; i < str.length; i++) {
				if (hand[str[i] - 'a'] != pre) {
					ans++;
				}
				pre = hand[str[i] - 'a'];
			}

			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}