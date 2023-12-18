import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if(a[0] == a[n-1]) {
			System.out.println(0);
			return;
		}
		int ans = 1;
		for(int i = 1; i < n; i++) {
			boolean flag = true;
			for(int j = 0; j < i; j++) {
				if(a[i]%a[j]==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}