import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
	
		long[] H = new long[N];
		
		long count = 0;

		for (int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		
		for (int i=0;i<H.length-K;i++) {
			count += H[i];
		}

		System.out.println(count);
		
	}
}
