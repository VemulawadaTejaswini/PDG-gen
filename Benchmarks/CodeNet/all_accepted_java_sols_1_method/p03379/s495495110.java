import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int halfN = n/2;
		ArrayList<Integer> xs = new ArrayList<>();

		for (int i=0; i<n;i++) {
			xs.add(i, scanner.nextInt());
		}
		ArrayList<Integer> sorted = new ArrayList<>(xs);
		Collections.sort(sorted);
		int x1 = sorted.get(halfN-1);
		int x2 = sorted.get(halfN);

		for (int i=0; i<n; i++) {
			if (xs.get(i)<=x1) {
				System.out.println(x2);
			}else {
				System.out.println(x1);
			}
		}
	}

}