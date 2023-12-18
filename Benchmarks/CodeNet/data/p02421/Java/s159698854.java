import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tSum = 0;
		int hSum = 0;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].compareTo(input[1]) > 0) {
				tSum += 3;
			} else if (input[0].compareTo(input[1]) == 0) {
				tSum += 1;
				hSum += 1;
			} else {
				hSum += 3;
			}
		}
		System.out.println(tSum + " " + hSum);
	}
}