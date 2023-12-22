import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int list[] = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		int cntList[] = new int[N];

		//2で割った際に余りが出るか
		//2で割った商に2で割った際に余りが出るか（繰り返し）
		//すべての要素で行った回数の中で最小の数

		for (int i = 0; i < N; i++) {
			int cnt = 0;
			while (list[i] % 2 == 0) {
				list[i] = list[i] / 2;
				cnt++;
			}
			cntList[i] = cnt;
		}

		int ans = cntList[0];
		for (int i = 1; i < N; i++) {
			if (ans > cntList[i]) {
				ans = cntList[i];
			}
		}
		System.out.println(ans);
	}
}