
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] sum = new int[n + 1];
		sum[0] = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'E') {
				sum[i + 1] = sum[i] + 1;
			} else {
				sum[i + 1] = sum[i];
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1; i < n + 1; i++) {
			int tmp = 0;
			tmp += i - 1 - sum[i - 1] + sum[n] - sum[i];
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
	}

}
