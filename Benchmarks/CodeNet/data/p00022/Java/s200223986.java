import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals("0")) {
					break;
				}
				final int n = Integer.parseInt(line);
				int[] ai = new int[n];
				for (int i = 0; i < n; i++) {
					ai[i] = Integer.parseInt(br.readLine());
				}
				System.out.println(solve(ai));
			}
		}	
	}
	public static long solve(int[] list) {
		long maxsum = Long.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			long sum = 0;
			for (int j = i; j < list.length; j++) {
				sum += list[j];
				if (maxsum < sum) {
					maxsum = sum;
				}
			}

			if (maxsum < sum) {
				maxsum = sum;
			}
		}
		return maxsum;
	}
}