import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		while (sc.hasNext()) {
			int input = sc.nextInt();
			int cnt = 0;
			int i, j;
			boolean flg;
			for (i = 3; i < input; i++) {
				flg = true;
				for (j = 3; j < i; i++) {
					if (i % j == 0) {
						flg = false;
					}
				}
				if (flg) {
					cnt++;
				}
			}
			ret.add(cnt);
		}
		for (int cnt : ret) {
			System.out.println(cnt);
		}
	}
}