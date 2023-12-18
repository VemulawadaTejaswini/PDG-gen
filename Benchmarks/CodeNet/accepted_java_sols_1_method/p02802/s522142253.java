import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int M = scanner.nextInt();
		boolean[] isAC = new boolean[N];
		int[] penalty = new int[N];
		int numAC = 0;
		int sumPenalty = 0;
		int p;
		String resultString;
		for (int i = 0; i < M; i++) {
			p = scanner.nextInt() - 1;
			resultString = scanner.next();
			if (!isAC[p]) {
				if (resultString.equals("AC")) {
					isAC[p] = true;
					numAC++;
					sumPenalty += penalty[p];
				} else {
					penalty[p]++;
				}
			}
		}
		System.out.println(numAC + " " + sumPenalty);

	}

}
