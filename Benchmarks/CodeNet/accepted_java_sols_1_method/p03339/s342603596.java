import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();

		int[] sw = new int[n + 1];
		int[] se = new int[n + 1];

		for(int i = 1; i < n; i++) {
			char a = s.charAt(i - 1);
			sw[i] = sw[i - 1];
			if(a == 'W') sw[i]++;
		}

		for(int i = n - 1; 0 < i; i--) {
			char a = s.charAt(i);
			se[i] = se[i + 1];
			if(a == 'E') se[i]++;
		}

		int ans = n;
		for(int i = 0; i < n; i++) {
			ans = Math.min(ans, sw[i] + se[i + 1]);
		}
		System.out.println(ans);
	}
}
