import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int cntStudent = 0;

			while ((cntStudent = sc.nextInt()) != 0) {
				List<Integer> datalist = new ArrayList<>();
				IntStream.range(0, cntStudent).forEachOrdered(i -> datalist.add(sc.nextInt()));
				IntSummaryStatistics summary = datalist.stream()
						.mapToInt(num -> num.intValue()).summaryStatistics();

				long cnt = summary.getCount();
				double avg = summary.getAverage();
				double variance = 0.0;
				for (int num : datalist) {
					variance += Math.pow((double)num -avg, 2);
				}

				System.out.println(Math.sqrt(variance / cnt));
			}
		}
	}
}
