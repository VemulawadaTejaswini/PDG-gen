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
			Boolean isZero = true;
			while (now < N) {
				if (k[now] > 0) {
					k[now] -= 1;
					isZero = false;
					allZero = false;
				} else if (k[now] <= 0 && isZero) {
				} else {
					count++;
					isZero = true;
				}
				now++;
			}
			if (!isZero) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);
	}
};