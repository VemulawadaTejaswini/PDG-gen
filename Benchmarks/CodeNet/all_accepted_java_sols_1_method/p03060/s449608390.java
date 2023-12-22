import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		int n = 0;
		int[] diffArray = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			n = Integer.parseInt(br.readLine());

			String[] v = br.readLine().split("\\s");
			String[] c = br.readLine().split("\\s");

			diffArray = new int[n];
			for (int i = 0; i < n; i++) {
				int vi = Integer.parseInt(v[i]);
				int ci = Integer.parseInt(c[i]);

				int diff = vi - ci;
				if (0 < diff) {
					diffArray[i] = diff;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		int sum = 0;
		for (int i = 0; i < diffArray.length; i++) {
			sum += diffArray[i];
		}
		System.out.println(sum);
	}

}
