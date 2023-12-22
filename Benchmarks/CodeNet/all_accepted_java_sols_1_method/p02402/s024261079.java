import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		final int n = Integer.parseInt(line);

		line = br.readLine().trim();
		String[] arr = line.split(" ");
		br.close();

		long min = 1000000;
		long max = -1000000;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			long v = Long.parseLong(arr[i]);
			min = Math.min(min, v);
			max = Math.max(max, v);
			sum += v;
		}
		System.out.println(min + " " + max + " " + sum);
	}
	
}