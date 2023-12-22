
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}
		boolean[] ans = new boolean[n + 1];
		for(int i = n; i > 0; i--) {
			int cnt = 0;
			for(int j = 2; j * i < n + 1; j++) {
				if(ans[j * i])
					cnt++;
			}
			if(a[i] == cnt % 2) {
				ans[i] = false;
			} else {
				ans[i] = true;
			}
		}
		int num = 0;
		for(int i = 1; i < n + 1; i++) {
			if(ans[i])
				num++;
		}
		System.out.println(num);
		for(int i = 1; i < n + 1; i++) {
			if(ans[i])
				System.out.print(i + " ");
		}
	}

}
