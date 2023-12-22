
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);

		int outCounter = 0;
		int tmp = 0;
		int now = 0;
		for (Integer i : a) {
			if (now != i) {
				if (now < tmp) {
					outCounter = outCounter + tmp - now;
				}else if (now > tmp) {
					outCounter = outCounter + tmp;
				}

				now = i;
				tmp = 0;
			}
			tmp++;
		}
		if (now < tmp) {
			outCounter = outCounter + tmp - now;
		}else if (now > tmp) {
			outCounter = outCounter + tmp;
		}

		System.out.println(outCounter);
	}
}
