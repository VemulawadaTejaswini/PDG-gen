import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			if (n == 0 && s == 0) {
				break;
			}
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = i+1;
			}
			System.out.println(subsetSum(n, a, s));
		}
		reader.close();
	}
	
	private int subsetSum(int n, int[] a, int s) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int r = s - a[i];
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int tmp = a[j] + a[k];
				if (tmp < r) {
					j++;
				} else if (tmp > r) {
					k--;
				} else {
					count++;
					j++;
					k--;
				}
			}
		}
		return count;
	}
}


