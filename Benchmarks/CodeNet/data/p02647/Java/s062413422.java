import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static int[] getStrings(Scanner sc, int num) {
		int[] stringList = new int[num];
		int i = 0;
		while(i<num) {
			int nextInt = sc.nextInt();
			stringList[i] = nextInt;
			i++;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] m = getStrings(sc, n);
		for (int i = 0; i < k; i++) {
			int[] two = new int[n+1];

			for (int j = 0; j < n; j++) {
				int l = Math.max(j - m[j], 0);
				int max = Math.min(j + m[j], n-1) + 1;
				two[l]++;
				two[max]--;
			}
			for (int o = 1; o < n; o++) {
				two[o] = two[o-1] + two[o];
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

	private static boolean isSame(int[] m, int[] n) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != n[i]) {
				return false;
			}
		}
		return true;
	}

}
