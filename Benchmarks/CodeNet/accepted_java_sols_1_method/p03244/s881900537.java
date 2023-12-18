import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] oddCnt = new int[100100];
		int[] evenCnt = new int[100100];

		Arrays.fill(oddCnt, 0);
		Arrays.fill(evenCnt, 0);

		for (int i = 0; i < N; i++) {
			int v = sc.nextInt();

			if (i % 2 == 0) evenCnt[v]++;
			else oddCnt[v]++;
		}

		int oddMax = 0, oddMaxId = 0, odd2ndMax = 0;
		int evenMax = 0, evenMaxId = 0, even2ndMax = 0;

		for (int i = 0; i < 100100; i++) {
			if (evenMax <= evenCnt[i]) {
				even2ndMax = evenMax;
				evenMax = evenCnt[i];
				evenMaxId = i;
			} else if (even2ndMax <= evenCnt[i]) {
				even2ndMax = evenCnt[i];
			}
			if (oddMax <= oddCnt[i]) {
				odd2ndMax = oddMax;
				oddMax = oddCnt[i];
				oddMaxId = i;
			} else if (odd2ndMax <= oddCnt[i]) {
				odd2ndMax = oddCnt[i];
			}
		}

		if (evenMaxId != oddMaxId) {
			System.out.println(N - evenMax - oddMax);
		} else if (even2ndMax > odd2ndMax) {
			System.out.println(N - even2ndMax - oddMax);
		} else {
			System.out.println(N - evenMax - odd2ndMax);
		}
	}
}
