import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int N = sc.nextInt();
				if(N == 0) break;
				int S = 1;
				
				if(N == 1) {
					System.out.println("deficient number");
					continue;
				}
				
				for(int i=2; i*i<=N; i++) {
					if(N % i == 0) {
						if(i * i == N) S += i;
						else  S +=  i + N / i;
					}
				}
				if(N == S) System.out.println("perfect number");
				else if(N > S) System.out.println("deficient number");
				else System.out.println("abundant number");
			}
		}
	}
}
