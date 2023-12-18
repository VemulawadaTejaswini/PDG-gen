import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] v = new int[n];
		int[] c = new int[n];
		Arrays.setAll(v, i -> sc.nextInt());
		Arrays.setAll(c, i -> sc.nextInt());
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.max(v[i] - c[i], 0);
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	
}


