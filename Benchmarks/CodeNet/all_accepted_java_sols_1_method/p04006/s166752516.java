import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		
		int[] min = a.clone();
		
		long ans = Long.MAX_VALUE;
		for(int i=0; i<N; i++) {
			long temp = (long)x*i;
			
			for(int j=0; j<N; j++) {
				min[j] = Math.min(min[j], a[(j-i+N)%N]);
				temp += min[j];
			}
			
			ans = Math.min(ans, temp);
		}
		
		System.out.println(ans);
		sc.close();
	}
}
