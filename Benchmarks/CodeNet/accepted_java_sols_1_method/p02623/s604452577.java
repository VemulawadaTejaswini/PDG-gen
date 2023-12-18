import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M  = keyboard.nextInt();
		long K  = keyboard.nextLong();
		
		long[] A  = new long[N+1];
		long[] B  = new long[M+1];
		long Asum = 0;
		long Bsum = 0;
		int countA = 0;
		int countB = 0;
		int Max = 0;
			
		for(int i=1; i<=N; i++) {
			Asum += keyboard.nextInt();
			A[i] = Asum;
			if(Asum <= K) {
				countA++;
			}
		}
		
		for(int j=1; j<=M; j++) {
			Bsum += keyboard.nextInt();
			B[j] = Bsum;
		}
		
		for(int k= countA; k >=0 ; k--) {
			while(countB+1 <= M && A[k]+B[countB+1]<= K) {
				countB++;
			}
			if(Max < k + countB) {
				Max = k + countB;
			}
		}

		System.out.print(Max);
		keyboard.close();	
	}
}