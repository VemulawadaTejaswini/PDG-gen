import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0, ans = 0;
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			int ii = i;
			while (ii % 2 == 0) {
				ii /= 2;
				cnt++;
				if (cnt > count) {
					count = cnt;
					ans = i;
				}
			}
		}
		if (N == 1)
			System.out.println(1);
		else
			System.out.println(ans);
		sc.close();
	}
}
