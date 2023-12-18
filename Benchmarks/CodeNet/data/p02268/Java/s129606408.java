import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			// Streamを挟まないほうが早いかテスト

			int n = Integer.parseInt(br.readLine());
			int[] S = new int[n];
			String[] tmp = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				S[i] = Integer.parseInt(tmp[i]);
			}
			int q = Integer.parseInt(br.readLine());
			tmp = br.readLine().split(" ");
			Main m = new Main();
			int cnt = 0;
			for (int i = 0; i < q; i++) {
				int key = Integer.parseInt(tmp[i]);
				if (m.binarySearch(S, key) != -1)
					cnt++;
			}
			System.out.println(cnt);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	int binarySearch(int[] S, int key) {
		int left = 0;
		int right = S.length;
		while (left < right) {
			int mid = (left + right) / 2;
			if (key == S[mid]) {
				return mid;
			} else if (key < S[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}

