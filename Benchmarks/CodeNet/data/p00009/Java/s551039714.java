
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
				if (isPrimeNum(i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
			ret.add(cnt);
		}
		for (int num : ret) {
			System.out.println(num);
		}
	}

	static boolean isPrimeNum(int num) {
		if (num == 2) {
			return true;
		}
		if (num < 2 || num % 2 == 0) {
			return false;
		}
		int i;
		for (i = 3; i <= Math.sqrt((double) num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}