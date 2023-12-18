import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		short numberOfTimes, checkTime = 0, count = 0;
		numberOfTimes = Short.parseShort(in.readLine());
		while (true) {
			if (checkTime == numberOfTimes) {
				break;
			}
			number = Integer.parseInt(in.readLine());
			for (int x = 2; x <= number; x++) {
				if (x > Math.sqrt(number)) {
					count++;
					break;
				}
				if (number % x == 0) {
					if (number != x) {
						break;
					} else if (number == x) {
						count++;
					}
				}
			}
			checkTime++;
		}
		System.out.println(count);
	}
}