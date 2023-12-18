import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n], c = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int ans = 0;
		for(int j = 0; j < n; j++) {
			if(v[j] > c[j]) {
				ans += v[j]-c[j];
			}
		}
		System.out.println(ans);
	}
}