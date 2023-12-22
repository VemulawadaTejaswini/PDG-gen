import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		int Xsum = Arrays.stream(X).sum();
		int average = Xsum / X.length;
		if((double)Xsum % X.length != 0.0) {

			int[] sums = new int[2];

			for (int i = 0; i < X.length; i++) {
				sums[0] += (X[i]-average) * (X[i]-average);
			}

			int averagePlusOne = average + 1;
			for (int i = 0; i < X.length; i++) {
				sums[1] += (X[i]-averagePlusOne) * (X[i]-averagePlusOne);
			}

			System.out.println(Arrays.stream(sums).min().getAsInt());

		} else {

			int sum = 0;
			for (int i = 0; i < X.length; i++) {
				sum += (X[i]-average) * (X[i]-average);
			}
			System.out.println(sum);
		}
	}
}