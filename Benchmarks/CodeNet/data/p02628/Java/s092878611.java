import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			scan.nextInt();
			int cnt = scan.nextInt();
			List<Integer> prices = new ArrayList<>();
			while(scan.hasNext()) {
				prices.add(scan.nextInt());
			}
			System.out.print(prices.stream().mapToInt(Integer::intValue).sorted().limit(cnt).sum());
		}
	}
}