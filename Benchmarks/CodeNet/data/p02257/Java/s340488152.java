import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTimes, number, count = 0;
		numberOfTimes = Integer.parseInt(in.readLine());
		for (int i = 0; i < numberOfTimes; i++) {
			number = Integer.parseInt(in.readLine());
			if (number == 1) {
				break;
			} else {
				for (int x = 2; x <= number; x++) {
					if (number % x == 0) {
						if (number != x) {
							break;
						} else if (number == x) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}