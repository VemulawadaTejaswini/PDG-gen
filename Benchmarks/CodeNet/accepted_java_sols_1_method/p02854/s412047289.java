import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] len = new long[n];
		long allLen = 0;
		for (int i = 0; i < n; i++) {
			len[i] = sc.nextLong();
			allLen = allLen + len[i];
		}
		long before = 0;
		long after = 0;
		int num = 0;
		while (after < allLen) {
			before = after;
			after = before + len[num] * 2;
			num++;
		}
		long ans = Math.min(after - allLen, allLen - before);
		System.out.println(ans);
	}
}