import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double r = Integer.parseInt(br.readLine());
			System.out.printf("%.6f %.6f", r * r * Math.PI, 2 * r * Math.PI);
		} catch (IOException e) {
			logger.info("Error:  Reading input data is failed.");
		}
	}
}