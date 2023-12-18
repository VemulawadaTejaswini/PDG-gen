

import java.util.Scanner;

public class Main {

	static int N;
	static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			N = sc.nextInt();
			
			if(N == 0) {
				break;				
			}
			
			sum = 0;
			
			//完全数判定
			for (int j = 1; j < N; j++) {
				if(N % j == 0) {
					sum += j;
				}
			}
			
			if(N == sum) {
				System.out.println("perfect number");
			}
			else if(N > sum) {
				System.out.println("deficient number");
			}
			else {
				System.out.println("abundant number");
			}
		}
	}
}