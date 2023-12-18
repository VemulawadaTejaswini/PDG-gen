import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = 1;
		while(K * (K + 1) < 2 * N) K++;
		// K * (K + 1) / 2 > N

		for(long k = K; k >= 0; k--) {
			if(N >= k) {
				System.out.println(k);
				N -= k;
			}
			if(N == 0) break;
		}
	}
}