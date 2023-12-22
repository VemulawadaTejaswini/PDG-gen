import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] line = br.readLine().split(" ");
			double x1 = Double.parseDouble(line[0]);
			double y1 = Double.parseDouble(line[1]);
			double x2 = Double.parseDouble(line[2]);
			double y2 = Double.parseDouble(line[3]);

			double diffX = Math.abs(x1 - x2);
			double diffY = Math.abs(y1 - y2);
			double z = diffX * diffX + diffY * diffY;
			System.out.println(String.format("%.5f", Math.sqrt(z)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}