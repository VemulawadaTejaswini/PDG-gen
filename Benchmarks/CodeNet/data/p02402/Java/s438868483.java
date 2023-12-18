

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		IntSummaryStatistics summaryStatistics = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(s -> Integer.parseInt(s)).summaryStatistics();

		System.out.println(String.format("%d %d %d",
				summaryStatistics.getMin(), summaryStatistics.getMax(),
				summaryStatistics.getSum()));
	}
}