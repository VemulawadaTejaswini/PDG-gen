import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int A = Integer.parseInt(sa[0]);
		int B = Integer.parseInt(sa[1]);
		int m = Integer.parseInt(sa[2]);

		sa = br.readLine().split(" ");
		int[] a = new int[A];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[B];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			int val = a[x] + b[y] - c;
			min = Math.min(min, val);
		}
		br.close();

		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		min = Math.min(min, a[0] + b[0]);
		System.out.println(min);
	}
}
