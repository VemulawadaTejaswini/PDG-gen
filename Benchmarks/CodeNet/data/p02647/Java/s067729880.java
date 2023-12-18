import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> array = getStrings(sc, n);
		Integer[] m = new Integer[n];
		m = array.toArray(new Integer[n]);
		for (int i = 0; i < k; i++) {
			Integer[] two = new Integer[n];
			for (int j = 0; j < n; j++) {
				two[j] = 0;
			}

			for (int j = 0; j < n; j++) {
				int l = j - m[j];
				if (l < 0) {
					l = 0;
				}
				int max = j + m[j];
				if (max > n-1) {
					max = n-1;
				}
				for (; l <= max; l++) {
					two[l]++;
				}
			}
			if (isSame(two, m)) {
				for (int j = 0; j < n; j++) {
					System.out.println(n);
				}
			}
			m = two;
		}
		for (int j = 0; j < n; j++) {
			System.out.println(m[j]);
		}
	}

	private static boolean isSame(Integer[] m, Integer[] n) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != n[i]) {
				return false;
			}
		}
		return true;
	}

}
