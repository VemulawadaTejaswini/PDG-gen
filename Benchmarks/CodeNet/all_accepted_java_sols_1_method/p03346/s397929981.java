import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] idxArr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			idxArr[a] = i;
		}
		int max = 0;
		int tmp = 0;
		for (int i = 2; i <= n; i++) {
			if (idxArr[i - 1] < idxArr[i]) {
				tmp++;
				if (tmp > max) {
					max = tmp;
				}
			} else {
				tmp = 0;
			}
		}
		System.out.println(n - max - 1);
	}
}
