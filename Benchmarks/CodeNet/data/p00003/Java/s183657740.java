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
		int side1 = 0, side2 = 0, side3 = 0;

		while ((line = br.readLine()) != null) {
			if (line.contains(" ")) {
				sides[0] = Integer.parseInt(line.split(" ")[0]);
				sides[1] = Integer.parseInt(line.split(" ")[1]);
				sides[2] = Integer.parseInt(line.split(" ")[2]);
				Arrays.sort(sides);
				side1 = sides[0];
				side2 = sides[1];
				side3 = sides[2];
				if (side3 * side3 == side1 * side1 + side2 * side2) {
					System.out.println(YES);
				} else {
					System.out.println(NO_);
				}
			}
		}
	}
}