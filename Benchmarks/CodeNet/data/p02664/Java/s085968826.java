import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s = in.next();
		char[] A = s.toCharArray();
		int N = A.length;
		for (int i = 0; i < N; i++) {

			if (A[i] != '?') {
				continue;
			}

			if (i == 0) {
				A[i] = A[i + 1] == 'P' ? 'D' : 'P';
			} else if (i == N - 1) {
				A[i] = 'D';
			} else {
				if (A[i - 1] == 'P') {
					A[i] = 'D';
				} else if (A[i + 1] == '?' || A[i + 1] == 'D') {
					A[i] = 'P';
				} else {
					A[i] = 'D';
				}
			}
		}
		System.out.print(new String(A));
		in.close();
	}

}
