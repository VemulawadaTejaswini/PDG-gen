import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3
		// 10 2 5
		// 6 3 4
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		int[] net = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			net[i] = v[i] - c[i];
		}
		Arrays.sort(net);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (net[i] > 0) {
				ans += net[i];
			}
		}
		System.out.println(ans);
	}
}

 
 

 
 
 
 
