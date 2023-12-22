import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n + 2];
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			h[i] = sc.nextInt();
		}
		int flag = 0;
		int flag2 = 0;

		int hoge = 0;
		int i = 1;
		while (flag == 0) {
			while (h[i] != 0 && i <= n) {
				hoge = h[i];
				h[i]--;
				i++;
				flag2++;
			}
			if (i == n + 1 && flag2 == 0) {
				flag++;
			} else if (i == n + 1) {
				flag2 = 0;
				i = 1;
				if (hoge != 0) {
					answer++;
				}
				hoge = 0;
			} else if (hoge != 0) {
				answer++;
				i++;
				hoge = 0;
			} else {
				i++;
				hoge = 0;
			}
		}
		System.out.print(answer);
		sc.close();
	}
}
