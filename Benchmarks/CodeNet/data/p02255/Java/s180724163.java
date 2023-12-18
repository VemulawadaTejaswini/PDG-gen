import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		for (int j = 0; j < n; j++) {
			int v = nums[j];
			int s = j - 1;
			while (s >= 0 && nums[s] > v) {
				nums[s + 1] = nums[s];
				s--;
			}
			nums[s + 1] = v;
			for (int t = 0; t < n; t++) {
				if (t == n - 1) {
					sb.append(nums[t]);
				} else {
					sb.append(nums[t] + " ");
				}
			}
			if (j == n - 1) {
				break;
			} else {
				System.out.println(sb);
				sb.delete(0, 2 * n - 1);
			}
		}
		System.out.print(sb);
	}
}