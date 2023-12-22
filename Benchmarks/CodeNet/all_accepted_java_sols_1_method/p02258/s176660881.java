import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputNumTimes = Integer.parseInt(br.readLine());

		int[] value = new int[inputNumTimes];

		for(int i = 0; i < inputNumTimes; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}

		int minValue = value[0];
		int maxValue = value[1] - value[0];

		for(int i = 1; i < inputNumTimes; i++) {
			maxValue = Math.max(maxValue, value[i] - minValue);
			minValue = Math.min(minValue, value[i]);
		}
		System.out.println(maxValue);
	}
}