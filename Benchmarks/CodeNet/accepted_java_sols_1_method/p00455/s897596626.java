import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException {

		Scanner scan = new Scanner(System.in);
		List<Integer> wTime = new ArrayList<Integer>();

		while (scan.hasNext()) {
			int t = Math
					.abs((scan.nextInt() * 3600 + scan.nextInt() * 60 + scan
							.nextInt())
							- (scan.nextInt() * 3600 + scan.nextInt() * 60 + scan
									.nextInt()));
			wTime.add(t);
		}
		for (int i = 0; i < wTime.size(); i++) {
			int tmp = wTime.get(i);
			int hh = tmp / 3600;
			tmp %= 3600;
			int mm = tmp / 60;
			int ss = tmp % 60;
			System.out.println(hh + " " + mm + " " + ss);
		}

	}
}