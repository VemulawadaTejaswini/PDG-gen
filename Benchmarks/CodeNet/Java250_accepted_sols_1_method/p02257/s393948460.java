import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int countResult = 0;

		int inputNumTimes = Integer.parseInt(br.readLine());

		for(int i = 0; i < inputNumTimes; i++) {
			int num = Integer.parseInt(br.readLine());
			boolean isPrimeNumber = true;

			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber) {
				countResult++;
			}
		}
		System.out.println(countResult);
	}
}