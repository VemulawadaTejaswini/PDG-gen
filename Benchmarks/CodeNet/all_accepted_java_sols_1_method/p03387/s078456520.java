import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		list.add(a);
		list.add(b);
		list.add(c);

		Collections.sort(list);

		int min = list.get(0);
		int mid = list.get(1);
		int max = list.get(2);

		int sub1 = max - mid;
		int sub2 = max - min;

		int sum = sub1 + sub2;

		if (sum % 2 == 0) {
			System.out.println(sum / 2);
		} else {
			System.out.println(sum / 2 + 2);
		}
		sc.close();

	}
}
