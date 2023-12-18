import java.util.Scanner;

public class Main {
	
	static boolean[] isPrime = new boolean[300001];
	
	static void prime(int n) {
		for(int i=2; i*n<300000; i++) {
			isPrime[n*i] = false;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] numprime = new int[300000];
			int k = 0;
			for(int i=2; i<300000; i++) {
				isPrime[i] = true;
			}
			for(int i=2; i<300000; i++) {
				if(isPrime[i]) {
					if(i%7 == 1 || i%7 == 6) {
						numprime[k] = i;
						k++;
						prime(i);
					}
					else {
						isPrime[i] = false; 
					}
				}
			}
			
			while(sc.hasNext()) {
				int N = sc.nextInt();
				if(N == 1) break;
				
				int cnt = 0;
				for(int i=0; i<k; i++) {
					if(numprime[i] <= N && N % numprime[i] == 0) {
						if(cnt == 0) {
							System.out.printf("%d %d", N, numprime[i]);
						}
						else {
							System.out.printf(" %d", numprime[i]);
						}
					}
				}
				System.out.println();
			}
		}
	}
}
