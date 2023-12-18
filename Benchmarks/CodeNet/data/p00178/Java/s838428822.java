
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			List<Boolean[]> list = new ArrayList<Boolean[]>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				if (a == 1) {
					int aa = -1;
					loop: for (int j = list.size() - 1; j >= 0; j--) {
						Boolean[] tmp = list.get(j);
						for (int k = c; k < c + b; k++) {
							if (tmp[k]) {
								break loop;
							}
						}
						aa = j;

					}
					if (aa == -1) {
						Boolean[] newMap = new Boolean[6];
						for (int k = 0; k < 6; k++) {
							if (c <= k && k < c + b) {
								newMap[k] = true;
							} else {
								newMap[k] = false;
							}
						}
						list.add(newMap);
					} else {
						Boolean[] tmp = list.get(aa);
						for (int k = c; k < c + b; k++) {
							tmp[k] = true;
						}
					}
				} else {
					int bb = b;
					int count = 0;
					for (int j = list.size() - 1; j >= 0; j--) {
						if (list.get(j)[c]) {
							break;
						} else {
							count++;
						}
					}
					int cn = Math.max(list.size() - count, 0);
					for (int j = cn; j < list.size() && j < cn + b; j++) {
						list.get(j)[c] = true;
						bb--;
					}
					if (bb > 0) {
						for (int j = 0; j < bb; j++) {
							Boolean[] boo = new Boolean[6];
							Arrays.fill(boo, false);
							boo[c] = true;
							list.add(boo);
						}
					}
				}
			}
			int ret = 0;
			for (Boolean[] ans : list) {
				int sum = 0;
				for (Boolean b : ans) {
					if (b) {
						sum++;
					}
				}
				ret += (sum % 5);
			}
			System.out.println(ret);
		}
	}
}