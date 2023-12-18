import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		int k = 0;
		int[] weights = null;

		try {
			String[] in = br.readLine().split(" ");
			n = Integer.parseInt(in[0]);
			k = Integer.parseInt(in[1]);

			weights = new int[n];
			for (int i = 0; i < n; i++) {
				weights[i] = Integer.parseInt(br.readLine());
			}

			br.close();
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}

		int low = 0;
		int high = Integer.MAX_VALUE;
		int mid = 0;

		while(low < high) {

			mid = (low+high) / 2;

			int portable = howManyPortable(weights, n, k, mid);

			if(portable < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		System.out.println(mid);

	}

	private static int howManyPortable(int[] weights, int n, int k, int p) {

		int index = 0;

		while(k > 0) {
			long sum = 0;
			while(true) {

				if(index == n) {
					k = 0;
					break;
				}

				sum += weights[index];

				if(sum > p) {
					k--;
					break;
				} else {
					index++;
				}

			}
		}

		return index;
	}
}