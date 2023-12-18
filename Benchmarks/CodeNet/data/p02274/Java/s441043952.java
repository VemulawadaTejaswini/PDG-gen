import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int merge(int left, int mid, int rigth, int[] arr) {
		int n1 = mid - left;
		int n2 = rigth - mid;
		int[] l = new int[n1 + 1];
		int[] r = new int[n2 + 1];
		for(int i = 0; i < l.length - 1; i++) {
			l[i] = arr[left + 1];
		}
		l[n1] = Integer.MAX_VALUE;
		for (int i = 0; i < r.length - 1; i++) {
			r[i] = arr[mid + i];
		}
		r[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		int count = 0;
		for(int k = left; k < rigth; k++) {
			if (l[i] > r[j]) {
				arr[k] = r[j];
				j++;
			} else {
				arr[k] = l[i];
				i++;
				count += j;
			}
		}
		return count;
	}
	public static int mergeSort(int left, int rigth, int[] arr) {
		int count = 0;
		if (left + 1 < rigth) {
			int mid = (left + rigth) / 2;
			count += mergeSort(left, mid, arr);
			count += mergeSort(mid, rigth, arr);
			count += merge(left, mid, rigth, arr);
		}
		return count;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String[] strings = br.readLine().split(" ");
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(strings[i]);
			}
			int count = mergeSort(0, n, arr);
			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
