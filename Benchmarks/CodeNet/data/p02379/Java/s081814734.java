import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] set = br.readLine().split(" ");
		int x1 = Integer.parseInt(set[0]);
		int y1 = Integer.parseInt(set[1]);
		int x2 = Integer.parseInt(set[2]);
		int y2 = Integer.parseInt(set[3]);

		double r = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.printf("%.8f\n", r);
	}
}