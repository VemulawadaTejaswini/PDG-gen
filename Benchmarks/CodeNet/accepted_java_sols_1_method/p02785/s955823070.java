import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		
		long time = 0;
		for(int i=0;i<n-k;i++) {
			time+=h[i];
		}
		
		System.out.println(time);
	}
}