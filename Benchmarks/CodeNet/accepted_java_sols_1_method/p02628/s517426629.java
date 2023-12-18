import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			list.add(p);
		}

		Collections.sort(list);

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += list.get(i);
		}

		System.out.println(sum);

		sc.close();
	}
}