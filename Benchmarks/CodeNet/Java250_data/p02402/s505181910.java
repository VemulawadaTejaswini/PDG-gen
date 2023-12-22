import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int kazu = Integer.parseInt(line);
		line = br.readLine();

		String[] keisanStr = line.split("[\\s]+");
		int[] keisanInt = new int[kazu];
		for (int i = 0; i < kazu; i++) {
			keisanInt[i] = Integer.parseInt(keisanStr[i]);
			// System.out.println(keisanInt[i]);
		}

		int min = keisanInt[0];
		int max = keisanInt[0];
		long sum = keisanInt[0];

		for (int q = 1; q < kazu; q++) {
			sum += keisanInt[q];

			if (min > keisanInt[q]) {
				min = keisanInt[q];
			} else if (max < keisanInt[q]) {
				max = keisanInt[q];
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}