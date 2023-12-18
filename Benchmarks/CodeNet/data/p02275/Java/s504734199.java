import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		int k = Integer.MIN_VALUE;
		int i = 0;
		for (String str : reader.readLine().split(" ")) {
			int num = Integer.parseInt(str);
			k = Math.max(k, num);
			a[i++] = num;
		}
		countingSort(a, b, k);
		StringBuilder sb = new StringBuilder();
		sb.append(b[0]);
		for (i = 1; i < n; i++) {
			sb.append(' ').append(b[i]);
		}
		System.out.println(sb.toString());
	}

	private static void countingSort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}
		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}		
	}
}
