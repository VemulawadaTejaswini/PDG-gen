import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			 Integer[]A = new Integer[N];
			
			double goukei = 0;
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				goukei+=A[i];
			}
			
			double koremimanhadame = goukei/(4.0*M);
			int count = 0;
			
			Arrays.sort(A,Collections.reverseOrder());
			
			for(int i = 0;i<N;i++) {
				if(koremimanhadame<=(double)A[i]) {
					count++;
					if(count ==M)break;
				}
			}
			
			System.out.println(count==M?"Yes":"No");
			
			
			
		}
		
		
	}
		

}