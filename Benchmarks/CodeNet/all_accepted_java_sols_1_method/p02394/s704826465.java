import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final String inputLine = br.readLine();
			final String[] inputNumbers = inputLine.split(" ");

			final Integer W = Integer.valueOf(inputNumbers[0]);
			final Integer H = Integer.valueOf(inputNumbers[1]);
			final Integer x = Integer.valueOf(inputNumbers[2]);
			final Integer y = Integer.valueOf(inputNumbers[3]);
			final Integer r = Integer.valueOf(inputNumbers[4]);

			if(x - r >= 0 && x + r <= W
					&& y - r >= 0 && y + r <= H) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

}
