import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<int[]> mfrs = new ArrayList<>();

		while(true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();

			if(m == -1 && f == -1 && r == -1) break;

			int[] mfr = new int[] {m, f, r};
			mfrs.add(mfr);
		}
		sc.close();

		for (int[] mfr : mfrs) {
			char result;

			int m = mfr[0];
			int f = mfr[1];
			int r = mfr[2];

			if (m == -1 || f == -1) {
				result = 'F';
			} else if (m + f >= 80) {
				result = 'A';
			} else if (m + f >= 65) {
				result = 'B';
			} else if (m + f >= 50) {
				result = 'C';
			} else if (m + f >= 30) {
				result = 'D';
				if(r >= 50) result = 'C';
			} else {
				result = 'F';
			}
			System.out.println(result);
		}

	}
}