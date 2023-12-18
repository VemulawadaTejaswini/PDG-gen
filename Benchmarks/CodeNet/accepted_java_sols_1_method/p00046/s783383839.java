import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;

		while ((line = br.readLine()) != null) {
			float altitude = Float.parseFloat(line);

			if (altitude > max)
				max = altitude;
			else if (altitude < min)
				min = altitude;
		}
		System.out.println(max - min);
	}
}