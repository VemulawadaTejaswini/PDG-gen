import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> A1 = new ArrayList<>();
		List<Integer> A2 = new ArrayList<>();
		List<Integer> A3 = new ArrayList<>();

		List<Integer> b = new ArrayList<>(Arrays.asList(0, 1, 2));
		List<Integer> c = new ArrayList<>(Arrays.asList(3, 4, 5));
		List<Integer> d = new ArrayList<>(Arrays.asList(6, 7, 8));
		List<Integer> e = new ArrayList<>(Arrays.asList(0, 3, 6));
		List<Integer> f = new ArrayList<>(Arrays.asList(1, 4, 7));
		List<Integer> g = new ArrayList<>(Arrays.asList(2, 5, 8));
		List<Integer> h = new ArrayList<>(Arrays.asList(2, 4, 6));
		List<Integer> j = new ArrayList<>(Arrays.asList(0, 4, 8));

		List<List<Integer>> all = new ArrayList<>();
		Collections.addAll(all, b, c, d, e, f, g, h, j);

		for (int i = 1; i <= 9; i++) {
			int a = sc.nextInt();
			A1.add(a);
		}

		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int bb = sc.nextInt();
			A2.add(bb);
		}

		int ee = 0;
		for (int m = 0; m <= a - 1; m++) {
			ee = A1.indexOf(A2.get(m));
			if (ee != -1) {
				A3.add(ee);
			}
		}

		for (List<Integer> ele : all) {
			if (A3.containsAll(ele)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}