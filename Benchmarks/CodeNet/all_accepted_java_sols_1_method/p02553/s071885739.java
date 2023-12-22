import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();
			String[] arr = data.split(" ");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			long c = Long.parseLong(arr[2]);
			long d = Long.parseLong(arr[3]);

			List<Long> xList = new ArrayList<Long>() {
				{
					add(a);
					add(b);
				}
			};

			List<Long> yList = new ArrayList<Long>() {
				{
					add(c);
					add(d);
				}
			};

			long ans = -1 * Long.MAX_VALUE;
			for (Long x : xList) {
				for (Long y : yList) {

					ans = Math.max(ans, x * y);

				}
			}

			System.out.println(ans);
		}
	}
}