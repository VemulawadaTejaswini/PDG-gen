import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if ("0".equals(line))
				break;
			int n = Integer.parseInt(line);

			line = br.readLine();
			String[] scores = line.split(" ");
			double sum = 0;
			for (String score : scores) {
				sum += Integer.parseInt(score);
			}
			double avg = sum / n;

			sum = 0;
			for (String score : scores) {
				sum += Math.pow(Integer.parseInt(score) - avg, 2);
			}
			double a2 = sum / n;

			System.out.printf("%.5f%n", Math.sqrt(a2));
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}
}