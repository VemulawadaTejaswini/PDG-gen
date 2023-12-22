

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(scan.next());
		}
		int contestNum = 0;
		int maxNum = N / 3;
		boolean firstQ;
		boolean secondQ;
		boolean thirdQ;
		for (int j = 0; j < maxNum; j++) {
			firstQ = false;
			secondQ = false;
			thirdQ = false;
			for (int i = 0; i < N; i++) {
				if (firstQ == false && P[i] != -1 && P[i] <= A) {
					firstQ = true;
					P[i] = -1;
				}
				if (secondQ == false && P[i] > A && P[i] <= B) {
					secondQ = true;
					P[i] = -1;
				}
				if (thirdQ == false && P[i] > B) {
					thirdQ = true;
					P[i] = -1;
				}
			}
			if (firstQ && secondQ && thirdQ) {
				contestNum++;
			}
		}
		System.out.println(contestNum);
	}
}
