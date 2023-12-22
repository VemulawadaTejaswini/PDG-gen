import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] R = new int[n];
		
		for(int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = R[0];
		
		for(int j = 1; j < n; j++) {
				max = Math.max(max, R[j] - min);
				min = Math.min(min, R[j]);
		}
		
		System.out.println(max);
	}
}