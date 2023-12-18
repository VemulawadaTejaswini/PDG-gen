import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		
		int a = p[0];
		int b = p[1];
		int c = 0;
		int ans = 0;
		
		for(int i = 2; i < n; i++) {
			c = p[i];
			if(a < b && b < c) {
				ans++;
			} else if(a > b && b > c) {
				ans++;
			}
			a = b;
			b = c;
		}
		
		System.out.println(ans);
	}
}
