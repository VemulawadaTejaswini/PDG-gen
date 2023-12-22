import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int taisyo = Integer.parseInt(line);
		int counter = 1;
		boolean zero = true;

		while (zero) {
			System.out.println("Case " + counter + ": " + taisyo);
			counter++;
			line = br.readLine();
			taisyo = Integer.parseInt(line);
			if (taisyo == 0) {
				zero = false;
			}
		}
	}
}