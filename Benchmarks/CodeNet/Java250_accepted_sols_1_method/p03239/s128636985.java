import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] row = line.split(" ");
		int n = Integer.parseInt(row[0]);
		int t = Integer.parseInt(row[1]);

		int minCost = 1001;
		for (int i = 0; i < n; i++) {
			String line2 = scanner.nextLine();
			String[] row2 = line2.split(" ");
			int cost = Integer.parseInt(row2[0]);
			int time = Integer.parseInt(row2[1]);

			if (time <= t && cost < minCost) {
				minCost = cost;
			}
		}
		if (minCost > 1000) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}

	}

}
