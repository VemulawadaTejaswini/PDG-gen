import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			char[] c = String.valueOf(i).toCharArray();
			
			int num = 0;
			for (char d : c) {
				num += d - '0';
			}
			if (a <= num && num <= b) {
				ans += i;
			}
			
		}
		System.out.println(ans);
	}
}