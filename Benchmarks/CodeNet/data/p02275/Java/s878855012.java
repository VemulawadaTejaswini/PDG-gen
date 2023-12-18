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
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			int k = 10000;
			count = new int[k + 1]; sort = new int[n];
			CountingSort(arr);
			for (int i = 0; i < n; i++) {
				if (i == n - 1) {
					System.out.println(sort[i]);
				} else {
					System.out.print(sort[i] + " ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
