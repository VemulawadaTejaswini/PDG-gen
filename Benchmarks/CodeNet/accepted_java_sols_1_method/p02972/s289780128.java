import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[][]A = new int[N][2];
		
		for(int i=0; i<N; i++) {
			A[i][1] = keyboard.nextInt();
		}
		
		int count =0;
		int[] ans = new int[N];
		for(int j=N; j>=1; j--) {
			if(A[j-1][0]%2 != A[j-1][1]) {
				for(int k=1; k*k<=j; k++) {
					if(j%k == 0) {
						A[k-1][0] ++;
						if(k != j/k) {
							A[j/k-1][0] ++;
						}
					}
				}
				count++;
				ans[j-1]++;
			}
		}
		
		System.out.println(count);
		for(int l=0; l<N; l++) {
			if(ans[l] == 1) {
				System.out.print((l+1)+ " ");
			}
		}
		keyboard.close();	
	}
}
