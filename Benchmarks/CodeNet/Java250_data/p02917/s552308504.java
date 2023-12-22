import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[N-1];
			
			int souwa=0;
			
			for(int i = 0;i<N-1;i++) {
				B[i] = scan.nextInt();
			}
			
			
			for(int i =N-1;i>=0;i--) {
				if(i == N-1) {
					A[i] = B[i-1];
					souwa+=A[i];
				}else if(i==0) {
					A[i] = B[i];
					souwa+=A[i];
				}else {
					A[i] = Math.min(B[i], B[i-1]);
					souwa+=A[i];
				}
			}
			
			
			
			System.out.println(souwa);
			
			
			
			
		}
		
		
	}
		

}
