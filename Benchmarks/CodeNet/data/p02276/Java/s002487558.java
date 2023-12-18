import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int idx = partition(a, 0, a.length - 1);
		StringBuilder sb = new StringBuilder();
		if (idx == 0) {
			sb.append("[").append(a[0]).append("]");
		} else {
			sb.append(a[0]);
		}
		for (int i = 1; i < n; i++) {
			sb.append(' ');
			if (idx == i) {
				sb.append("[").append(a[i]).append("]");
			} else {
				sb.append(a[i]);
			}
		}
		System.out.println(sb.toString());
	}

	private static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

