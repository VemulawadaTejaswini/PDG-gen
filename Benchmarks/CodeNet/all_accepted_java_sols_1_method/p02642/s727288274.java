import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X  = keyboard.nextInt();
		int[] A = new int[X];
		
		for(int i=0; i<X; i++) {
			A[i] = keyboard.nextInt();
		}
		
		Arrays.sort(A);
		
		int ans = 0;
		final int nmax = 1000010;		
		int[] hako = new int[nmax];

		for(int j=0; j<X; j++) {
			if(hako[A[j]] == 0) {
				if(j == X-1 || A[j] != A[j+1]) {
					ans++;
				}
				for(int k=1; k*A[j]<nmax; k++) {
					hako[k*A[j]] = 1;
				}
			}
		}
		
			
		System.out.print(ans);
		keyboard.close();	
	}
}
