import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			if ((n | q) == 0) {
				break;
			}

			TreeSet<Integer>[] set = new TreeSet[n];
			for (int i = 0; i < n; i++) {
				set[i] = new TreeSet<Integer>();
				int k = sc.nextInt();
				for (int j = 0; j < k; j++) {
					set[i].add(sc.nextInt());
				}
			}

			int maxNum = 0, maxCnt = 0;
			for (int i = 1; i <= 100; i++) {
				int cnt = 0;
				for (int j = 0; j < n; j++) {
					if (set[j].contains(i)) cnt++;
				}
				if (maxCnt < cnt) {
					maxNum = i;
					maxCnt = cnt;
				}
			}

			if (maxCnt < q) {
				System.out.println(0);
			} else {
				System.out.println(maxNum);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}