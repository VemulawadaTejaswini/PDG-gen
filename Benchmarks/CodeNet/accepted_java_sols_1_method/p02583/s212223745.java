import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var l = new long[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextLong();
		}
		Arrays.sort(l);
		var cnt = 0;
		for (int i = l.length - 1; i >= 2; i--) {
			for (int j = i - 1; j >= 1; j--) {
				for (int k = j - 1; k >= 0; k--) {
					if (l[k] + l[j] > l[i]) {
						if (l[i] != l[j] && l[i] != l[k] && l[k] != l[j]) {
							if (l[i] + l[j] > l[k]
									&& l[i] + l[k] > l[j]) {
								cnt++;
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
