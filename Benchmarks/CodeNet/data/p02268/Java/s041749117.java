import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] ss = br.readLine().split(" ");

		int[] S = new int[n];

		for (int i = 0; i < n; i++) {
			S[i] = Integer.parseInt(ss[i]);
		}

		int q = Integer.parseInt(br.readLine());

		String[] qq = br.readLine().split(" ");

		int[] Q = new int[q];

		for (int i = 0; i < q; i++) {
			Q[i] = Integer.parseInt(qq[i]);
		}

		System.out.println(binarySearch(S, Q));

	}

	static int binarySearch(int[] nums, int[] key) {

		int i = 0;

		int count = 0;

		while (i != key.length) {

			int left = 0;

			int right = nums.length;

			while (left < right) {

				int mid = (left + right) / 2;

				if (nums[mid] == key[i]) {
					count++;
					break;
				} else if (nums[mid] > key[i]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}
			i++;

		}

		return count;

	}

}