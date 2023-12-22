import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Integer[] ArrayA = new Integer[n];

		for (int i = 0; i < n; i++) {
			ArrayA[i] = sc.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(ArrayA));
		Collections.sort(list);
		int Max0 = list.get(n-1);
		int Max1 = list.get(n-2);

		for (int i = 0; i < n; i++) {

			if (ArrayA[i] == Max0) {
				System.out.println(Max1);
			} else {
				System.out.println(Max0);
			}

		}

	}
}