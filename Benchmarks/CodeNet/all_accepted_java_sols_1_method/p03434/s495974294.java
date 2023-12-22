
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int sum_Alice = 0;
		int sum_Bob = 0;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				sum_Alice += list.get(list.size() - i - 1);
			} else {
				sum_Bob += list.get(list.size() - i - 1);
			}
		}
		System.out.println(sum_Alice-sum_Bob);
	}

}
