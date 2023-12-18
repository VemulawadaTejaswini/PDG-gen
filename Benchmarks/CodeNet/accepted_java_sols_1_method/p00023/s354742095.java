import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < inputNum; i++) {
			String[] inputData = sc.nextLine().split(" ");
			double[] d = new double[6];
			for (int j = 0; j < 6; j++) {
				d[j] = Double.parseDouble(inputData[j]);
			}
			double distance = Math.sqrt((d[0] - d[3]) * (d[0] - d[3])
					+ (d[1] - d[4]) * (d[1] - d[4]));
			double a = d[2] + d[5];
			int printNum = 0;
			if (distance > a) {
				printNum = 0;
			} else {

				if (d[2] > d[5] + distance) {
					printNum = 2;
				} else if (d[5] > d[2] + distance) {
					printNum = -2;
				} else {
					printNum = 1;
				}

			}
			System.out.println(printNum);
		}
	}

}