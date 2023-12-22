import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		int min = Integer.MAX_VALUE;
		int sub = 0;
		
		for(int i=0; i<N; i++) {
			h[i]= sc.nextInt();
		}
		Arrays.sort(h);
		for(int i=0; i<N-K+1; i++) {
			sub = h[i+K-1] - h[i];
			min = Math.min(min, sub);
		}
		System.out.println(min);
    }
}