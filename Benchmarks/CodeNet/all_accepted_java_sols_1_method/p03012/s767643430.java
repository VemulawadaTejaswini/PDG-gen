import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] W = new int[N];
		for (int i = 0; i < N; i++) {
			W[i] = scan.nextInt();
		}
		int min = 10000;
		for (int i = 0; i < N; i++) {
			int S1 = 0;
			int S2 = 0;
			for (int j = 0; j < N; j++) {
				if (i <j) {
					S1 += W[j];
				} else {
					S2 += W[j];
				}
			}
			if (Math.abs(S1 - S2) < min) {
				min = Math.abs(S1 - S2);
			}
		}
		System.out.println(min);
	}

}
