import java.util.Arrays;
 
public class Main {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
 
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		long[] H = new long[N];
		long sum = 0;
		
		
		for (int i = 0; i < N; i++) {
			H[i] = scan.nextLong();
		}
		
		if(K >= N ) {
			System.out.println(0);
			return;
		} 
		
		Arrays.sort(H);
		
		
		for(int i =N-1; K>0  ; i--) {
			H[i] = 0;
			K--;
		}
	
		for(long h : H) {
			sum += h;
		}
	
			System.out.println(sum);
		}
	
	}
