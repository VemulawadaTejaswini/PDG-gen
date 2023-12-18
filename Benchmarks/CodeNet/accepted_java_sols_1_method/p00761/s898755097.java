import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			int num = sc.nextInt();
			int keta = sc.nextInt();

			if (num == 0 && keta == 0) {
				return;
			}

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0;; i++) {
				if (map.containsKey(num)) {

					System.out.println(map.get(num) + " " + num + " "
							+ (i - map.get(num)));
					break;
				} else {
					map.put(num, i);
				}

				char[] array = new char[keta];
				for (int j = keta - 1; j >= 0; j--) {
					int p = 1;
					for (int k = 0; k < j; k++) {
						p *= 10;
					}

					array[keta - j - 1] = (char) ('0' + ((num / p) % 10));

				}

				char[] big = new char[keta];
				System.arraycopy(array, 0, big, 0, keta);
				Character[] big_s = new Character[keta];
				for (int j = 0; j < keta; j++) {
					big_s[j] = big[j];
				}

				char[] small = new char[keta];
				System.arraycopy(array, 0, small, 0, keta);

				Arrays.sort(small);

				Arrays.sort(big_s, Collections.reverseOrder());
				for (int j = 0; j < keta; j++) {
					big[j] = big_s[j];
				}

				int small_num = Integer.parseInt(String.valueOf(small));
				int big_num = Integer.parseInt(String.valueOf(big));

				num = big_num - small_num;

			}
		}
		
		
	}
}	