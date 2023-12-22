import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(final String[] args) throws Exception {

		try {

			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			final String[] intputStringList = br.readLine().split(" ");

			final StringBuilder contestName = new StringBuilder();
			contestName.append(intputStringList[0].substring(0, 1))
			           .append(intputStringList[1].substring(0, 1))
					   .append(intputStringList[2].substring(0, 1));

			System.out.println(contestName);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}
}