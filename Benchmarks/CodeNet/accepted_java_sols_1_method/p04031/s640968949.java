import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = min; i <= max; i++) {
			int temp = 0;
			for(int j = 0; j < N; j++) {
				temp += Math.pow(i - a[j], 2);
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}
}
