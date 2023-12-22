import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			int[] H = new int[N];
			//ArrayList<Integer> hp  = new ArrayList<Integer>();
			
			
			for(int i = 0;i<N;i++) {
				H[i] = scan.nextInt();
			}
			
			Arrays.sort(H);
			
			
			
			
			if(N<=K) {//必殺技だけで全員倒せる
				System.out.println(0);
			}else{
				long kaisuu = 0;
				for(int i = 0;i<N-K;i++) {
					kaisuu +=(long)H[i];
				}
				
				
				
				System.out.println(kaisuu);
			}
        }
    }
}
			
			
			
			
			
			