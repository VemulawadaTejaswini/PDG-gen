import java.util.*;
public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
			 A[i] = keyboard.nextInt();
			 B[i] = A[i];
		}
		
		Arrays.sort(A);
		int count = 0;
		for(int j= 0; j<N; j++) {
			if(A[j] != B[j]) {
			count++;
			}
		}
		if(count == 2 || count == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		keyboard.close();	
	}
}
