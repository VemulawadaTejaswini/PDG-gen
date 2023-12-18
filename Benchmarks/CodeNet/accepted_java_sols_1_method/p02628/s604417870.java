import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>();
		int pSum = 0;
		for (int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			pSum += tmp;
			p.add(tmp);
		}
		Collections.sort(p, Comparator.reverseOrder());

		for (int i = 0; i < p.size(); ++i) {
			if (n == k) {
				break;
			}

			pSum -= p.get(i);
			--n;
		}
		System.out.println(pSum);
	}
}
