import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int ans = 0;
		int i = 0;
		while(x > 0 && n - 1 >= i) {
			if(x < a[i] || (i == n - 1 && a[i] != x)) {
				i++;
				break;
			} else {
				x -= a[i];
				ans++;
				i++;
			}
		}
		System.out.println(ans);
	}
}
