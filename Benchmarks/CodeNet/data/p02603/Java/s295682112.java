import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long p = 1000;
			long n = Integer.parseInt(sc.next());
			int buy = Integer.parseInt(sc.next());
			long k = p / buy;
			for (int i = 1; i < n; i++) {
				int sell = Integer.parseInt(sc.next());
				if (sell > buy) {
					// 売って買う
					p += (sell - buy) * k;
					buy = sell;
					k = p / sell;
				} else {
					// 買いなおし
					buy = sell;
					k = p / sell;
				}
			}
			System.out.print(p);
		}
	}
}