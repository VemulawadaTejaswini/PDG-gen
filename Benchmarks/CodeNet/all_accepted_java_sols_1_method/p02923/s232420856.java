import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] height = new long[N];
		for(int i = 0; i < N; i++) {
			height[i] = sc.nextLong();
		}
		sc.close();
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < N - 1; i++) {
			if(height[i] >= height[i+1]) {
				count++;
				max = Math.max(max, count);
			}
			else {
				count = 0;
			}
		}
		System.out.println(max);
	}
}