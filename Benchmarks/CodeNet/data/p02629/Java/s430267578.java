import java.util.*;

public class Main {

	static long DIVIDER = 26;
	static Map<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n = N;
		sc.close();

		// Mapの作成
		createMap();

		// 何桁かを調べる
		int cnt = 1;
		while (true) {
			long num = (long) (n - (Math.pow(DIVIDER, cnt)));
			if (num <= 0) {
				break;
			} else {
				n = num;
				cnt++;
			}
		}

		// 各桁で差分になる数字を算出
		long[] diff = new long[14];
		diff[0] = 0;
		diff[1] = DIVIDER;
		for (int i = 2; i < 14; i++) {
			diff[i] = diff[i - 1] + (long) Math.pow(DIVIDER, i);
		}
		N -= diff[cnt - 1];

		// 各桁のアルファベットを特定
		int digit = cnt;
		int[] keys = new int[cnt];

		for (int i = cnt - 1; i >= 0; i--) {
			keys[i] = (int) Math.ceil(N / Math.pow(DIVIDER, digit - 1));
			digit--;
		}

		String ans = "";
		for (int i = 0; i < cnt; i++) {
			ans += map.get(keys[i]);
		}
		System.out.println(ans);
	}

	public static void createMap() {
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		map.put(7, "g");
		map.put(8, "h");
		map.put(9, "i");
		map.put(10, "j");
		map.put(11, "k");
		map.put(12, "l");
		map.put(13, "m");
		map.put(14, "n");
		map.put(15, "o");
		map.put(16, "p");
		map.put(17, "q");
		map.put(18, "r");
		map.put(19, "s");
		map.put(20, "t");
		map.put(21, "u");
		map.put(22, "v");
		map.put(23, "w");
		map.put(24, "x");
		map.put(25, "y");
		map.put(26, "z");
	}
}
