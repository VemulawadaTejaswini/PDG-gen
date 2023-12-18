import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {
			String[] params = line.split(",");
			int v1 = Integer.parseInt(params[10]), v2 = Integer.parseInt(params[11]);
			int sum = 0;
			for (int i = 0 ; i < 10 ; i++) sum += Integer.parseInt(params[i]);
			double l = v1 * (double)sum / (v1+v2);
			int dist = 0;
			for (int i = 0 ; i < 10 ; i++) {
				dist += Integer.parseInt(params[i]);
				if (dist >= l) {
					System.out.println(i+1); break;
				}
			}
		}

	}
}