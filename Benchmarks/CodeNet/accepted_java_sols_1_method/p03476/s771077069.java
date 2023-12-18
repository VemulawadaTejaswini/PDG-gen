import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
		int MAX = 100001;
		boolean[] np = new boolean[MAX];
		int[] a = new int[MAX];

		np[0] = true;
		np[1] = true;
		for (int i = 2; i < MAX; i++) {
			if (!np[i]) {
				for (int j = i + i; j < MAX; j += i) {
					np[j] = true;
				}
			}
		}

		for (int i = 1; i < MAX; i++) {
			if (!np[i] && !np[(i+1)/2]) {
				a[i] = a[i - 1] + 1;
			} else {
				a[i] = a[i - 1];
			}
		}

		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans[i] = a[r] - a[l - 1];
		}

		for (int i = 0; i < q; i++) {
			System.out.println(ans[i]);
		}
	}
}
