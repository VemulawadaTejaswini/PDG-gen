import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long C = sc.nextLong();

		long[] sushiPos = new long[N];
		long[] sushiCal = new long[N];
		long[] accCal = new long[N];

		long sum = 0;

		long[] calLeft = new long[N];
		long[] calLeftRev = new long[N];
		long[] calRight = new long[N];
		long[] calRightRev = new long[N];

		for (int i = 0; i < N; i++) {
			sushiPos[i] = sc.nextLong();
			sushiCal[i] = sc.nextLong();
			sum += sushiCal[i];
			accCal[i] = sum;
			calLeft[i] = sum - sushiPos[i];
			long tmp = Math.max(sum - (sushiPos[i] * 2), 0);
			calRightRev[i] = (i == 0) ? tmp : Math.max(tmp, calRightRev[i - 1]);
		}

		sum = 0;
		for (int j = 0; j < N; j++) {
			int i = (N - j - 1);
			sum += sushiCal[i];
			calRight[i] = sum - (C - sushiPos[i]);
			long tmp = Math.max(sum - ((C - sushiPos[i]) * 2), 0);
			calLeftRev[i] = (j == 0) ? tmp : Math.max(tmp, calLeftRev[i + 1]);
		}

		long maxCal1 = 0;
		for (int i = 0; i < N; i++) {
			maxCal1 = Math.max(maxCal1, calLeft[i] + (i == (N - 1) ? 0 : calLeftRev[i + 1]));
		}

		long maxCal2 = 0;

		for (int j = N-1; j >=0; j--) {
			maxCal2 = Math.max(maxCal2, calRight[j] + (j == 0 ? 0 : calRightRev[j - 1]));
		}

		System.out.println(Math.max(maxCal1, maxCal2));
		sc.close();
	}

}
