import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

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
				BigDecimal x1 = new BigDecimal(dataSet[0]).setScale(1);
				BigDecimal y1 = new BigDecimal(dataSet[1]).setScale(1);
				BigDecimal x2 = new BigDecimal(dataSet[2]).setScale(1);
				BigDecimal y2 = new BigDecimal(dataSet[3]).setScale(1);
				BigDecimal x3 = new BigDecimal(dataSet[4]).setScale(1);
				BigDecimal y3 = new BigDecimal(dataSet[5]).setScale(1);
				BigDecimal x = new BigDecimal(dataSet[6]).setScale(1);
				BigDecimal y = new BigDecimal(dataSet[7]).setScale(1);

				BigDecimal xMax = x1.max(x2.max(x3));
				BigDecimal xMin = x1.min(x2.max(x3));

				BigDecimal yMax = y1.max(y2.max(y3));
				BigDecimal yMin = y1.min(y2.max(y3));

				if (x.compareTo(xMax) < 0 && x.compareTo(xMin) > 0 && y.compareTo(yMax) < 0 && y.compareTo(yMin) > 0) {
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