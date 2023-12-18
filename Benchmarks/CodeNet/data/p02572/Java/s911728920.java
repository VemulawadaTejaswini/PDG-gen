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

		// 全部足す
		long sum = inputList.stream().reduce((long) 0, (a, b) -> a + b);

		// 自分×自分以外の和
		for (int j = 0; j < inputList.size(); j++) {
			long num = inputList.get(j);
			productList.add(num * (sum - num));
		}

		// 足しこんで、2で割る
		long sumProduct = productList.stream().reduce((long) 0, (a, b) -> a + b) / 2;

		System.out.println(sumProduct % 1000000007);
	}
}