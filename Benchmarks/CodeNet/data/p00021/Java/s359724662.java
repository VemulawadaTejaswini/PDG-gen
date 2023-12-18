import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] coordinate = str.split(" ", 8);
			double x1 = Double.parseDouble(coordinate[0]);
			double y1 = Double.parseDouble(coordinate[1]);
			double x2 = Double.parseDouble(coordinate[2]);
			double y2 = Double.parseDouble(coordinate[3]);
			double x3 = Double.parseDouble(coordinate[4]);
			double y3 = Double.parseDouble(coordinate[5]);
			double x4 = Double.parseDouble(coordinate[6]);
			double y4 = Double.parseDouble(coordinate[7]);
			double inclination1 = (y1 - y2) / (x1 - x2);
			double inclination2 = (y3 - y4) / (x3 - x4);
			double a = inclination1;
			double b = inclination2;
			if (Math.pow(100000, 2) * (a - b) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}