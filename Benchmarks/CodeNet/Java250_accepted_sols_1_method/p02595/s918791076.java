import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();

			String[] arr = data1.split(" ");

			int N = Integer.parseInt(arr[0]);
			int D = Integer.parseInt(arr[1]);

			List<String> list = new ArrayList<String>();
			for (int i = 0; i < N; i++) {
				String data = scanner.nextLine();
				list.add(data);
			}

			int ans = 0;
			for (int i = 0; i < list.size(); i++) {

				String[] arr1 = list.get(i).split(" ");
				double x = Double.parseDouble(arr1[0]);
				double y = Double.parseDouble(arr1[1]);

				double xx = Math.pow(x, 2);
				double yy = Math.pow(y, 2);

				double s = Math.sqrt(xx + yy);
				if (s <= D) {
					ans++;
				}
			}

			System.out.println(ans);
		}
	}
}