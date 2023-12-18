import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();

		long num1 = num;
		//		long startTime = System.currentTimeMillis();

		HashMap<Long, Long> map = new HashMap<Long, Long>();
		boolean flag = true;
		for (long i = 2L; i <= Math.sqrt(num); i = i + 2L) {
			if (num % i == 0L) {
				flag = false;
				num /= i;
				if (num == 1L) {
					if (map.containsKey(i)) {
						map.put(i, map.get(i) + 1L);
					} else {
						map.put(i, 1L);
					}
				} else {
					if (map.containsKey(i)) {
						map.put(i, map.get(i) + 1L);
					} else {
						map.put(i, 1L);
					}
				}
				i = 1L;
			}
		}

		HashMap<Long, Long> map1 = new HashMap<Long, Long>();

		if (flag) {
			map1.put(num, 1L);
		}

		long ans = 0L;
		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			map1.put(entry.getKey(), 1L);
		}

		for (Map.Entry<Long, Long> entry : map1.entrySet()) {
			flag = true;
			long tmp = 1L;
			long key = entry.getKey();
			while (flag) {
				tmp = tmp * key;
				if (num1 % tmp == 0) {
					num1 = num1 / tmp;
					ans = ans + 1L;
//					System.out.println("tmp" + tmp);
//					System.out.println("num" + num1);
				} else {
					flag = false;
					tmp = 1L;
				}
			}
		}
		System.out.println(ans);

		//		long endTime = System.currentTimeMillis();
		//		System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}
}
