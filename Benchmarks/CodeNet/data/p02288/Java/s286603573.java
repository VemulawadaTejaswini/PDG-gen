import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n+1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n ;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		reader.close();
		
		for (int i = n / 2 + 1; i >= 1; i--) {
			maxHeapify(i, n, a);
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

	private void maxHeapify(int cur, int n, int[] a) {
		
		int l = cur * 2;
		int r = l + 1;
		int max = cur;
		if (l <= n && a[max] < a[l]) {
			max = l;
		}
		if (r <= n && a[max] < a[r]) {
			max = r;
		}
		if (max != cur) {
			int tmp = a[max];
			a[max] = a[cur];
			a[cur] = tmp;
			maxHeapify(max, n , a);
		}
	}
}
