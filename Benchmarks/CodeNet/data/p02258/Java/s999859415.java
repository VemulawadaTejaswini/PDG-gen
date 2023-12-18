import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[n];
		for (int i=0; i<n; i++) {
			ints[i] = sc.nextInt();
		}
		
		int min = ints[0];
		int ans = Integer.MIN_VALUE;
		for (int i=1; i<n; i++) {
			ans = Math.max(ans,ints[i]-min);
			min = Math.min(min,ints[i]);
		}
		
		System.out.println(ans);
	}
}			
