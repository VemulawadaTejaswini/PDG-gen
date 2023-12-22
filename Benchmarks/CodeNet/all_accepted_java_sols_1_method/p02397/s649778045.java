import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		boolean zeroFlag = true;

		while (zeroFlag) {
			String[] hikakuStr = line.split("[\\s]+");
			int x = Integer.parseInt(hikakuStr[0]);
			int y = Integer.parseInt(hikakuStr[1]);

			if (x == 0 && y == 0) {
				zeroFlag = false;
			} else if (x < y) {
				System.out.println(x + " " + y);
				line = br.readLine();
				hikakuStr = line.split("[\\s]+");
			} else {
				System.out.println(y + " " + x);
				line = br.readLine();
				hikakuStr = line.split("[\\s]+");
			}
		}
	}
}