import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			String[] tmp = br.readLine().split(" ");
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(tmp[i]);
			}
			int q = Integer.parseInt(br.readLine());
			tmp = br.readLine().split(" ");
			int cnt = 0;
			for (int i = 0; i < q; i++) {
				int key = Integer.parseInt(tmp[i]);
				if (binarySearch(s, key) != -1) {
					cnt++;
				}
			}
			System.out.println(cnt);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static int binarySearch(int[] s, int key) {
		int left = 0;
		int right = s.length;
		int mid = (left + right) / 2;

		while (left < right) {
			mid = (left + right) / 2;
			if (s[mid] == key) {
				return mid;
			} else if (key < s[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return -1;

	}

}

