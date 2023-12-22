import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		final ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		Collections.reverse(list);

		final int max = list.get(0);
		list.remove(0);

		int total = 0;
		for (int j = 0; j < list.size(); j++) {
			total = total + list.get(j);
		}

		java.lang.System.out.println(max < total ? "Yes" : "No");

	}

}
