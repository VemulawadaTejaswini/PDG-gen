import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String[] inputData = sc.next().split(",");

			double[] l = new double[10];
			double length = 0;

			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(inputData[i]);
				length = length + l[i];
			}

			double v1 = Integer.parseInt(inputData[10]);
			double v2 = Integer.parseInt(inputData[11]);
			double cross = v1 * (length / (v1 + v2));
			int stationNum = 0;
			length = 0;

			for (int i = 0; i < 10; i++) {
				length = length + l[i];
				stationNum++;

				if (length >= cross) {
					break;
				}
			}
			System.out.println(stationNum);
		}
	}
}