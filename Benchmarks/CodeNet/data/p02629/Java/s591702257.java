import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long num = 0;
		int index = 1;
		while (num < N) {
			num += Math.pow(26, index);
			index++;
		}
		int[] alp = new int[index-1];
		for (int i = index-2; -1 < i; i--) {
			for (int j = 26; -1 < j; j--) {
				if (Math.pow(26, i)*j <= N) {
					if (j == 0) {
						alp[index-2-i] = 26;
						alp[index-2-i-1]--;
						break;
					}
					alp[index-2-i] = j;
					N -= Math.pow(26, i)*j;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = alp.length-1; -1< i; i--) {
			int a = alp[i];
			if (a == 0) {
				a = 26;
				alp[i-1]--;
			}
			sb.append((char) ('a'-1+a));
		}
		System.out.println(sb.reverse());
	}
}