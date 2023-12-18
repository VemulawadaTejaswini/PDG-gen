
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws IOException {
		StringBuilder builder = new StringBuilder();

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


		String input = bufferedReader.readLine();
		builder.append(input);
		logger.debug(builder.reverse().toString() );

	}}