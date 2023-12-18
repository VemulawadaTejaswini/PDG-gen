import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()), maximum = Integer.MIN_VALUE, minimum;
		int[] timeRate = new int[n];
		for (int i = 0; i < n; i++) {
			timeRate[i] = Integer.parseInt(in.readLine());
		}
		minimum = timeRate[0];
		for (int x = 1; x < n; x++) {
			if (maximum < timeRate[x] - minimum) {
				maximum = timeRate[x] - minimum;
			}
			if (minimum > timeRate[x]) {
				minimum = timeRate[x];
			}
		}
		System.out.println(maximum);
	}
}