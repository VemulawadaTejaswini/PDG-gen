import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> a = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			a.add(scanner.nextInt());
		}
		a.sort(Comparator.reverseOrder());
		int A, B;
		A = 0;
		B = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				A += a.get(0);
			} else {
				B += a.get(0);
			}
			a.remove(0);
		}
		System.out.println(A - B);
	}

}
