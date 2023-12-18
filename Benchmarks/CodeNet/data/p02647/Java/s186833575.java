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
		Integer[][] two = new Integer[2][n];
		for (int i = 0; i < n; i++) {
			two[0][i] = m[i];
			two[1][i] = 0;
		}
		int c = 0;
		for (int i = 0; i < k; i++) {
			if (isSame(two[1-c], n)) {
				for (int j = 0; j < n-1; j++) {
					System.out.print(n + " ");
				}
				System.out.println(n);
			}
			for (int j = 0; j < n; j++) {
				int l = j - two[c][j];
				if (l < 0) {
					l = 0;
				}
				int max = j + two[c][j];
				if (max > n-1) {
					max = n-1;
				}
				for (; l <= max; l++) {
					two[1-c][l]++;
				}
			}
			c=1-c;
			for (int j = 0; j < n; j++) {
				two[1-c][j] = 0;
			}
		}
		for (int j = 0; j < n-1; j++) {
			System.out.print(two[c][j] + " ");
		}
		System.out.println(two[c][n-1]);
	}

	private static boolean isSame(Integer[] m, int num) {
		for (int i = 0; i < num; i++) {
			if (m[i] != num) {
				return false;
			}
		}
		return true;
	}

}
