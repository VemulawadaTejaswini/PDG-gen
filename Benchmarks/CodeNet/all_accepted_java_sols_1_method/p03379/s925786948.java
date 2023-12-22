import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int X[] = new int[N];
		int Xcopy[] = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(sc.next());
			Xcopy[i] = X[i];
		}

		Arrays.sort(Xcopy);

		int mSmall = Xcopy[N / 2 - 1];
		int mLarge = Xcopy[N / 2];

		for (int i = 0; i < N; i++) {
			if (X[i] <= mSmall) {
				System.out.println(mLarge);
			} else {//if (X[i] > mLarge) {
				System.out.println(mSmall);
			}
		}

	}

}