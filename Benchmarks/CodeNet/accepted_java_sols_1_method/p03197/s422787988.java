import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 1) {
				System.out.println("first");
				return;
			}
		}
		System.out.println("second");
	}
}
