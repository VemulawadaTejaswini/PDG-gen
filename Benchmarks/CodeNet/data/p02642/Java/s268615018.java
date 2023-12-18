import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] == 1)cnt1++;
			if (A[i] == 2)cnt2++;
			if (A[i] == 3)cnt2++;
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(cnt1 == 1) {
				cnt = 1;
				break;
			} else if (cnt1 > 1) {
				cnt = 0;
			}

			if(cnt2 >= 1) {
				if (A[i] > 2 && A[i] % 2 == 0) {
					cnt++;
					continue;
				}
				if(cnt2 == 1) {
					if(A[i] == 2) {
						cnt++;
						continue;
					}
				} else if (A[i] == 2) {
					continue;
				}
			}
			if(cnt3 >= 1) {
				if (A[i] > 3 && A[i] % 3 == 0) {
					cnt++;
					continue;
				}
				if(cnt3 == 1) {
					if(A[i] == 3) {
						cnt++;
						continue;
					}
				} else if (A[i] == 3) {
					continue;
				}
			}

			int flag = 1;
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
