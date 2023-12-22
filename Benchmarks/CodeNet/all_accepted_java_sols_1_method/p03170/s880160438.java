import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		try (Scanner scan = new Scanner(System.in)) {
 
			int N = scan.nextInt();
			int K = scan.nextInt()+1;
 			int[] A = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = scan.nextInt();
			}
			
          int[] dp = new int[K];
          
          for(int i=1; i<K; i++) {
            for(int j=0; j<N; j++) {
              int num = i-A[j];
              if(num >= 0 && dp[num]==0) {
               dp[i] = 1;
               break; 
              }
            }
          }
          
          if(dp[K-1]==1) {
            System.out.println("First");
          } else {
            System.out.println("Second");
          }
			
		}
	}
}