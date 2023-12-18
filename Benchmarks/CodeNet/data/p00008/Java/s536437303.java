import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		while (sc.hasNext()) {
			int i, j, k, l;
			int cnt = 0;
			int input = sc.nextInt();
			for (i = 0; i <= 9; i++) {
				for (j = 0; j <= 9; j++) {
					for (k = 0; k <= 9; k++) {
						for (l = 0; l <= 9; l++) {
							if (i + j + k + l == input) {
								cnt++;
							}
						}
					}
				}
			}
			ret.add(cnt);
		}
		for (int cnt : ret) {
			System.out.println(cnt);
		}
	}
}