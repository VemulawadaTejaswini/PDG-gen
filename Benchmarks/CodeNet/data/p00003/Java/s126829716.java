import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int side = 0;
		int[] sides = new int[3];

		while ((line = br.readLine()) != null) {
			try {
				side = Integer.parseInt(line.split(" ")[0]);
				sides[0] = side * side;
				side = Integer.parseInt(line.split(" ")[1]);
				sides[1] = side * side;
				side = Integer.parseInt(line.split(" ")[2]);
				sides[2] = side * side;
				Arrays.sort(sides);
				if (sides[2] == sides[0] + sides[1]) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}
		}
	}
}