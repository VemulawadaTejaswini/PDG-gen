import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] count;
	static int[] sort;


	public static void CountingSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			sort[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
	}
	public static void main(String[] args) {
		try(BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] arr = new int[n];
			int k = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
				if (arr[i] > k) {
					k = arr[i];
				}
			}
			count = new int[k + 1]; sort = new int[n];
			CountingSort(arr);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				if (i == n - 1) {
					sb.append(sort[i] + "\n");
				} else {
					sb.append(sort[i] + " ");
				}
			}
			System.out.print(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
