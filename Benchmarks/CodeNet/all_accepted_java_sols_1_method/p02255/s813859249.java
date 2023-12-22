import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] A = line.split(" +");
		for (int i = 0; i < N; i++) {
			if (i != 0)
				System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();

		for (int i = 1; i < N; i++) {
			String key = A[i];
			int j = i - 1;
			while (j >= 0 && Integer.parseInt(A[j]) > Integer.parseInt(key)) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;
			for (int k = 0; k < N; k++) {
				if (k != 0)
					System.out.print(" ");
				System.out.print(A[k]);
			}
			System.out.println();
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}
}