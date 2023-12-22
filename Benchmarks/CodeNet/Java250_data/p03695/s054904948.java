import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] scoreList = new int[N];
		for (int i = 0; i < N; i++) {
			scoreList[i] = sc.nextInt();
		}

		int[] rate = new int[9];
		for (int score : scoreList) {
			if (1 <= score && score < 400) {
				rate[0] = 1;
			}
			if (400 <= score && score < 800) {
				rate[1] = 1;
			}
			if (800 <= score && score < 1200) {
				rate[2] = 1;
			}
			if (1200 <= score && score < 1600) {
				rate[3] = 1;
			}
			if (1600 <= score && score < 2000) {
				rate[4] = 1;
			}
			if (2000 <= score && score < 2400) {
				rate[5] = 1;
			}
			if (2400 <= score && score < 2800) {
				rate[6] = 1;
			}
			if (2800 <= score && score < 3200) {
				rate[7] = 1;
			}
			if (3200 <= score) {
				rate[8] += 1;
			}
		}
		int min = 0;
		for (int i = 0; i < 8; i++) {
			min += rate[i];
		}
		if (min == 0 && rate[8] > 0) {
			System.out.print(1 + " ");
		} else {
			System.out.print(min + " ");
		}
		int max = min + rate[8] ;
		System.out.print(max);
	}

}
