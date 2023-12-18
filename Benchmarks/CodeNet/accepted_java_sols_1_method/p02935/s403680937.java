import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		double a;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		ArrayList<Double> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextDouble());
		}

		Collections.sort(list);

		a = list.get(0);

		for (int i = 1; i < n; i++) {
			a = (a + list.get(i)) / 2;
		}

		System.out.println(a);


	}
}
