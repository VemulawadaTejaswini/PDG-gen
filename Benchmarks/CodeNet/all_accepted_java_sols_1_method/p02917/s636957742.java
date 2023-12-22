import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n];
		int ans = 0;
		
		b[0] = sc.nextInt();
		b[1] = b[0];
		for(int i = 2; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			if(b[i] > b[i + 1]) {
				b[i] = b[i+ 1];
			}
			ans += b[i];
		}
		ans += b[n - 1];
		
		System.out.print(ans);
	}
}