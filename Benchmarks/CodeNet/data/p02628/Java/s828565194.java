import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] fruit = new int[n];
		for(int i = 0; i < n; i++) fruit[i] = in.nextInt();
		Arrays.sort(fruit);
		int ans = 0;
		for(int i = 0; i < k; i++) {
			ans += fruit[i];
		}
		System.out.println(ans);
	}
}