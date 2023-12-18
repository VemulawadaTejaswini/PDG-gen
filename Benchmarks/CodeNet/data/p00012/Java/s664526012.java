import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();

			while (str != null) {
				String[] dataSet = str.split(" ", 0);

				double x1 = Double.valueOf(dataSet[0]);
				double y1 = Double.valueOf(dataSet[1]);
				double x2 = Double.valueOf(dataSet[2]);
				double y2 = Double.valueOf(dataSet[3]);
				double x3 = Double.valueOf(dataSet[4]);
				double y3 = Double.valueOf(dataSet[5]);
				double x = Double.valueOf(dataSet[6]);
				double y = Double.valueOf(dataSet[7]);

				double xMax = Math.max(x1, Math.max(x2, x3));
				double xMin = Math.min(x1, Math.min(x2, x3));
				double yMax = Math.max(y1, Math.max(y2, y3));
				double yMin = Math.min(y1, Math.min(y2, y3));

				if (xMax > x &&  x > xMin && yMax > y && y > yMin) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				str = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}