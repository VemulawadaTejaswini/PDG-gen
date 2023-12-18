import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int K = scan.nextInt();

                int[] A = new int[N];
                int[] temp;

                for (int i = 0; i < N; i++) {
                	A[i] = scan.nextInt();
                }

                scan.close();
                
                if (K >= N-1) {
                	
                	for (int k = 0; k < N; k++) {
                    	System.out.print(N + " ");
                    }

                    System.out.println();
                	
                } else {

	                for (int j = 0; j < K; j++) {
	
	                	 temp = new int[N];
	
	                	for (int n = 0; n < N; n++) {
	
	                		temp[n]++;
	
	                		for (int a = 1; a <= A[n]; a++) {
	                			if (n+1 + a <= N) {
	                				temp[n + a]++;
	                			}
	                			if (n+1 - a >= 1) {
	                				temp[n - a]++;
	                			}
	
	                		}
	                	}
	
	                	A = temp;
	
	                }
	
	                for (int k = 0; k < N; k++) {
	                	System.out.print(A[k] + " ");
	                }
	
	                System.out.println();
	                
                }

        }

}