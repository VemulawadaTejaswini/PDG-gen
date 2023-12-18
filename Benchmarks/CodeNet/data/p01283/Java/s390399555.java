import java.util.*;
public class Main { 

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			if(N == 0) break;
			int[] I = new int[N+1];
			for(int i = 1; i <= N; i++) {
				I[i] = stdIn.nextInt();
			}
			int M = 256;
			int S = 99999999;
			int A = 99999999;
			int C = 99999999;
			double min = 99999999;
			for(int s = 0; s <= 15; s++) {
				for(int a = 0; a <= 15; a++) {
					for(int c = 0; c <= 15; c++) {
						int R[] = new int[N+1];
						R[0] = s;
						for(int i = 1; i <= N; i++) {
							R[i] = (a * R[i-1] + c)%M;
						}
						int O[] = new int[256];
						for(int i = 1; i <= N; i++) {
							O[(I[i] + R[i]) % M]++;
						}
						double H = 0;
						for(int i = 0; i < 256; i++) {
							if(O[i] > 0) {
								H -= O[i] / (double)N * Math.log(O[i] / (double)N);
							}
							
						}
						if(H + 1e-10 < min) {
							min = H;
							S = s;
							A = a;
							C = c;
						}
						
					}
				}
				
			}
			System.out.println(S + " " + A + " " + C);
		}
	}
}

	