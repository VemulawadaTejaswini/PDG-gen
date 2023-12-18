import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] xx = new int[n];
		int[] yy = new int[m];
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			xx[i] = sc.nextInt();
			xList.add(xx[i]);
		}
		for (int i = 0; i < m; i++) {
			yy[i] = sc.nextInt();
			yList.add(yy[i]);
		}
		Optional<Integer> xmax = xList.stream().max((a, b) -> a.compareTo(b));
		Optional<Integer> ymin = yList.stream().min((a, b) -> a.compareTo(b));
		int point = xmax.get() + 1;
		if (xmax.get() < point && point <= ymin.get() && x < point && point <= y) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
 	}
}