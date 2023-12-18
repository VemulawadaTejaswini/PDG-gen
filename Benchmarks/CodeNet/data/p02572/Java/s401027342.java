import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Long> inputList = new ArrayList<Long>();
		ArrayList<Long> productList = new ArrayList<Long>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			inputList.add(a);
		}

		// 累積
		long sum = 0;
		long ans = 0;
		for (int j = 0; j < n; j++) {
			ans = (inputList.get(j) * sum) % 1000000007;
			productList.add(ans);
			sum += inputList.get(j);
		}

		System.out.println(productList.stream().mapToLong(x -> x).sum());
	}
}