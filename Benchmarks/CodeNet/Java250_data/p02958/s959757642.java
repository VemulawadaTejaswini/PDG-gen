import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N];
		int a;

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
			a = P[i];
			Q[i] = a;
		}

		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = N - 1; j > i; j--) {
				if (P[j - 1] > P[j]) {
					int tmpNum = P[j - 1];
					P[j - 1] = P[j];
					P[j] = tmpNum;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (Q[i] - P[i] != 0) {
				count++;
			}
		}
		if(count <= 2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}