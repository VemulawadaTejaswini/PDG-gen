import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
 
		int[] sum = new int[N + 1];
		Arrays.fill(sum, 0);
		for (int i = 0; i < N; i++) {
			if(i + 1 < N && s.charAt(i) == 'A' && s.charAt(i + 1) == 'C')
				sum[i + 1] = sum[i] + 1;
			else
				sum[i + 1] = sum[i];
		}
 
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
 
			int ans = sum[r - 1] - sum[l - 1];
			System.out.println(ans);
		}
	}
 
}