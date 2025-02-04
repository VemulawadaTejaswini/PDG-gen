import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c = in.next().toCharArray();
		int[] num = new int[26];
		
		for (int i = 0; i < c.length; i++) {
			num[c[i] - 'a']++;
		}
		
		boolean isBeautiful = true;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				isBeautiful = false;
				break;
			}
		}
		
		System.out.println(isBeautiful ? "Yes" : "No");
	}
}