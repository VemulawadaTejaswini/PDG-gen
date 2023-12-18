import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] price = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		int money = 1000;
		int stocks = 0;

		for (int i = 1; i < len; i++) {
			if (price[i] > price[i - 1]) {
				stocks = money / price[i - 1];
				money =  money % price[i - 1] + stocks * price[i];
			}
		}

		System.out.println(money);
	}

}