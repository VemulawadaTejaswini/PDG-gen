import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			for(int i = 0;i<N;i++) A[i] = scan.nextInt();
			Arrays.sort(A);
			
			int B[] = new int[A[N-1]+1];
			
			for(int i = 0;i<N;i++) {
				for(int j = A[i];j<=A[N-1];j = j+A[i]) {
					B[j]++;
				}
			}
			
			int count = 0;
			for(int i = 0;i<N;i++) {
				if(B[A[i]]==1)count++;
			}
			
			System.out.println(count);
			
			
			
		}
		
		
	}
		

}
