import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[] A  = new int[N-1];
		
		for(int i=0; i<N-1; i++) {
			A[i] = keyboard.nextInt();
		}
		
		int[] SV = new int[N+1];
		
		for(int j=0; j<N-1; j++) {
			SV[A[j]] ++;
		}
		
		for(int k=1; k<=N; k++) {
			System.out.println(SV[k]);
		}
		keyboard.close();	
	}
}
