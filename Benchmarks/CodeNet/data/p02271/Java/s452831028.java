import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static boolean solve(int i, int m, int[] a) {
		if(m == 0) {
			return true;
		} else if(i >= a.length) {
			return false;
		}

		boolean result = solve(i + 1, m, a) || solve(i + 1, m - a[i], a);

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int numberA = Integer.parseInt(br.readLine());

		String[] progressionA = br.readLine().split(" ");

		int[] A = new int[numberA];

		for (int i = 0; i < numberA; i++) {
            A[i] = Integer.parseInt(progressionA[i]);
		}

		int q = Integer.parseInt(br.readLine());

		String[] progressionM = br.readLine().split(" ");

		int[] m = new int[q];

		for (int i = 0; i < q; i++) {
			m[i] = Integer.parseInt(progressionM[i]);
		}

		for (int i = 0; i < m.length; i++) {
			if(solve(0, m[i], A)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}