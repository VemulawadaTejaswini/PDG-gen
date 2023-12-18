import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		try {
			String sentence = br.readLine().toUpperCase();
			System.out.println(sentence);
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("An exception occurs.");
		}
	}
}