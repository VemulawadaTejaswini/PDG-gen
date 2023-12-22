import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int total = 0;
		for (int i = 0; i < K ; i++) {
			int price = 1001;
			int idx = 0;
			for (int j = 0; j < list.size(); j++) {
				if (price > list.get(j)) {
					price = list.get(j);
					idx = j;
				}
			}
			list.remove(idx);
			total += price;
		}
		System.out.println(total);
	}

}
