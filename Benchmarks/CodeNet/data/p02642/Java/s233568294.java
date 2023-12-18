import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		boolean flag2 = false;
		boolean flag3 = false;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			flag2 = A[i] == 2;
			flag3 = A[i] == 3;
		}

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int flag = 1;
			if(flag2) {
				if (A[i] != 2 && A[i] % 2 == 0) {
					cnt++;
					continue;
				}
			}
			if(flag3) {
				if (A[i] != 3 && A[i] % 3 == 0) {
					cnt++;
					continue;
				}
			}

			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (A[i] >= A[j] && A[i] % A[j] == 0) {
						flag = 0;
						break;
					}
				}
			}

			cnt += flag;
		}

		System.out.println(cnt);

		sc.close();
	}
}
