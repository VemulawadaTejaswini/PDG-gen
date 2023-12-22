import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder answer = new StringBuilder();
			String lb = System.getProperty("line.separator");
			
			while (true) {
				final int n = Integer.parseInt(input.readLine());
				if (n == 0) {
					break;
				}
				
				final String[] line = input.readLine().split(" ");
				int[] scores = new int[n];
				double average = 0;
				for (int i = 0; i < n; i++) {
					scores[i] = Integer.parseInt(line[i]);
					average += scores[i];
				}
				average /= n;

				double deviation = 0;
				for (int i = 0; i < n; i++) {
					deviation += Math.pow(scores[i] - average, 2);
				}
				deviation = Math.pow(deviation / n, 0.5);
				answer.append(String.valueOf(deviation)).append(lb);
			}
			input.close();
			
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}