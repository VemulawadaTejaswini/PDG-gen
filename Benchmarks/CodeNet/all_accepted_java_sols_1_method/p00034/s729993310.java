import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int[] rails = new int[10];
			int total = 0;

			int v1 = 0;
			int v2 = 0;

			//
			int i = 0;
			for (String s : line.split(",")) {
				if (i < 10) {
					rails[i] = Integer.parseInt(s);
					total += rails[i];
				} else if (i == 10) {
					v1 = Integer.parseInt(s);
				} else if (i == 11) {
					v2 = Integer.parseInt(s);
				}
				i++;
			}

			//
			double across = (double) total * (double) v1 / (double) (v1 + v2);

			int sum = 0;
			for (int j = 0; j < rails.length; j++) {
				if (across == sum) {
					System.out.println(j + 1);
					break;
				}
				sum += rails[j];
				if (across <= sum) {
					System.out.println(j + 1);
					break;
				}
			}
		}
	}
}