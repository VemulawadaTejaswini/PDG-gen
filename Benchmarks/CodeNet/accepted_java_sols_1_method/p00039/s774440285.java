import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final char[] ROMA = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	private static final int[] ROMA_NUM = {1, 5, 10, 50, 100, 500, 1000};

	public static void main(String[] args) {
		Map<Character, Integer> roma_num = new HashMap<Character, Integer>();
		for(int $ = 0; $ < ROMA.length; $++) {
			roma_num.put(ROMA[$], ROMA_NUM[$]);
		}

		while(sc.hasNext()) {
			String str = sc.next();
			char[] roma = str.toCharArray();

			int num = 0;
			int number = 0;
			int ans = 0;

			for(int $ = roma.length - 1; $ >= 0; $--) {
				number = num;
				num = roma_num.get(roma[$]);

				if(number > num) {
					ans -= num;
				} else {
					ans += num;
				}

			}

			System.out.println(ans);
		}
	}

}