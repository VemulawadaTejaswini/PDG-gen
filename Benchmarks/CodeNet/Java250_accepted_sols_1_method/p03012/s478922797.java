import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int num = sn.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			list.add(sn.nextInt());
		}

		List<Integer> min = new ArrayList<Integer>();

		for (int t = 0; t < num; t++) {
			int S1 = 0;
			int S2 = 0;

			// S1
			for (int i = 0; i <= t; i++) {
				S1 = S1 + list.get(i);
			}
			// S2
			for (int i = t + 1; i < num; i++) {
				S2 = S2 + list.get(i);
			}

			min.add(Math.abs(S1 - S2));
		}

		Collections.sort(min);

		System.out.println(min.get(0));
	}
}
