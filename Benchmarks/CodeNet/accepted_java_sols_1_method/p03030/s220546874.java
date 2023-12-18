import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] S = new String[N];
		int[] P = new int[N];
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			P[i] = sc.nextInt();

			num[i]++;

			for (int j = 0; j < i; j++) {
				if (S[i].compareTo(S[j]) < 0) {
					num[j]++;
				} else if (S[i].compareTo(S[j]) > 0) {
					num[i]++;
				} else if(S[i].equals(S[j])) {
					if (P[i] > P[j]) {
						num[j]++;
					} else {
						num[i]++;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (num[j] == i + 1) {
					System.out.println(j + 1);
				}
			}
		}
	}
}