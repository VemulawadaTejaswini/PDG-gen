import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int num, maxNum = -1, nextMaxNum = -1;
		boolean duplicate = false;
		for (int i = 0; i < N; i++) {
			num = sc.nextInt();

			if (num > maxNum) {
				nextMaxNum = maxNum;
				maxNum = num;
				duplicate = false;
			} else if (num == maxNum) {
				duplicate = true;
			} else {
				nextMaxNum = Math.max(nextMaxNum, num);
			}
			A[i] = num;
		}

		for (int i = 0; i < N; i++) {
			if (A[i] == maxNum && !duplicate) {
				System.out.println(nextMaxNum);
			} else {
				System.out.println(maxNum);
			}
		}
	}

}
