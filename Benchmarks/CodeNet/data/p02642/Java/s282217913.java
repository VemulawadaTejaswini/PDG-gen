import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());

		int count = 0;
		for (int i = 0; i < n; i++) {
			var countFlg = true;
			if(i>0 && a[i]==a[i-1]) {
				countFlg=false;
			}else {
				for (int j = i + 1; j < n; j++) {
					if (i == j) {
						continue;
					} else if (a[i] % a[j] == 0) {
						countFlg = false;
						break;
					}
				}
			}
			if (countFlg) {
				count++;
			}
		}
		System.out.println(count);
	}
}
