import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] list = new int [n + 1];
		list[0] = 0;

		for(int i = 1; i <= n; i++) {
			list[i] = sc.nextInt();
			list[i] += list[i-1];
		}
		int ans = 0;
		for(int i = 0; i <= n; i++) {
			if( list[i] <= x) ans++;
			else break;
		}
		System.out.println(ans);
	}
}