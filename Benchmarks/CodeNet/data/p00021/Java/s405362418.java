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
			int amountOfDataset = Integer.parseInt(str);

			for(int i = 1; i <= amountOfDataset; i++){
				str = br.readLine();
				String[] dataSet = str.split(" ", 0);

				BigDecimal x1 = new BigDecimal(dataSet[0]).setScale(5);
				BigDecimal y1 = new BigDecimal(dataSet[1]).setScale(5);
				BigDecimal x2 = new BigDecimal(dataSet[2]).setScale(5);
				BigDecimal y2 = new BigDecimal(dataSet[3]).setScale(5);
				BigDecimal x3 = new BigDecimal(dataSet[4]).setScale(5);
				BigDecimal y3 = new BigDecimal(dataSet[5]).setScale(5);
				BigDecimal x4 = new BigDecimal(dataSet[6]).setScale(5);
				BigDecimal y4 = new BigDecimal(dataSet[7]).setScale(5);

				BigDecimal parallelAB = (y1.subtract(y2)).divide(x1.subtract(x2), 5, BigDecimal.ROUND_HALF_UP);
				BigDecimal parallelCD = (y3.subtract(y4)).divide(x3.subtract(x4), 5, BigDecimal.ROUND_HALF_UP);

				if (parallelAB.compareTo(parallelCD) == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}