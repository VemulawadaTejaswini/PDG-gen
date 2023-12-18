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
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int q = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < q; i++) {
			if (subsetSum(Integer.parseInt(st.nextToken()), a)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}
	
	private boolean subsetSum(int s, int[] a) {
		return subsetSum(0, s, a);
	}
	
	private boolean subsetSum(int i, int s, int[] a) {
		if (s == 0) {
			return true;
		}
		if (i >= a.length) {
			return false;
		}
		return subsetSum(i+1, s-a[i], a) || subsetSum(i+1, s, a);
	}
}
