import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			String[] pointAry = br.readLine().split(" ");
			double total = 0;
			for (int i = 0; i < n; i++) {
				total += Integer.parseInt(pointAry[i]);
			}
			double mean = total / n;
			double var = 0;
			for (int i = 0; i < n; i++) {
				var += Math.pow(Integer.parseInt(pointAry[i]) - mean, 2);
			}
			System.out.println(Math.sqrt(var / n));
			n = Integer.parseInt(br.readLine());
		}
	}
}