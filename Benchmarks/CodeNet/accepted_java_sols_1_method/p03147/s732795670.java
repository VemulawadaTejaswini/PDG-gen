import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k[] = new int[N];
		Boolean allZero = false;
		int count = 0;

		for (int i = 0; i < N; i++) {
			k[i] = sc.nextInt();
		}

		while (!allZero) {
			allZero = true;
			int now = 0;
			int subcount = 0;
			while (now < N) {
				if (k[now] > 0) {
					k[now] -= 1;
					subcount++;
					allZero = false;
				} else if (k[now] <= 0 && subcount == 0) {
				} else {
					count++;
					subcount = 0;
				}
				now++;
			}
			if (subcount != 0) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);
	}
};

