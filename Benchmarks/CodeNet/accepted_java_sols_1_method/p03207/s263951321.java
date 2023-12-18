import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		List<Integer> priceList = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			priceList.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(priceList);

		int total = 0;

		for (int i = 0; i < priceList.size(); i++) {

			if (i == priceList.size() - 1) {
				total += priceList.get(i) / 2;
			} else {
				total += priceList.get(i);
			}
		}

		System.out.println(total);
	}

}
