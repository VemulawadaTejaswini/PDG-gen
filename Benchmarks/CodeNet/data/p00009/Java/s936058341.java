import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		while (sc.hasNextLine()) {
			int i, j, cnt = 0;
			int num = sc.nextInt();
			boolean flg;
			for (i = 2; i <= num; i++) {
				flg = true;
				for (j = 2; j < i; j++) {
					if (i != j && i % j == 0) {
						flg = false;
					}
				}
				if (flg) {
					cnt++;
				}
			}
			ret.add(cnt);
		}
		for (int num : ret) {
			System.out.println(num);
		}
	}
}