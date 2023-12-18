import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static String YES = "YES";
	private static String NO_ = "NO";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] sides = new int[3];

		while ((line = br.readLine()) != null) {
			if (line.contains(" ")) {
				sides[0] = Integer.parseInt(line.split(" ")[0]);
				sides[1] = Integer.parseInt(line.split(" ")[1]);
				sides[2] = Integer.parseInt(line.split(" ")[2]);
				Arrays.sort(sides);
				if (Math.pow(sides[2], 2) == (Math.pow(sides[0], 2) + (Math
						.pow(sides[1], 2)))) {
					System.out.println(YES);
				} else {
					System.out.println(NO_);
				}
			}
		}
	}
}