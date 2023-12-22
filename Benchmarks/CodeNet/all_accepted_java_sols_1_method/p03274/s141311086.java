
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		String[] datas = br.readLine().split(" ");

		int[] arr = new int[datas.length];
		for (int i = 0; i < datas.length; i++) {
			arr[i] = Integer.parseInt(datas[i]);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int l = i;
			int r = i + k - 1;
			if (r == n) {
				break;
			}
			min = Math.min(min, Math.abs(arr[r] - arr[l]) + Math.min(Math.abs(arr[r]), Math.abs(arr[l])));
		}
		System.out.println(min);
	}
}