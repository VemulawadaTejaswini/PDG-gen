import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[][]A = new int[N][2];
		
		for(int i=0; i<N; i++) {
			A[i][0] = i+1;
			A[i][1] = keyboard.nextInt();
		}
		Arrays.sort(A, (l,r) -> {return r[1]-l[1];});
		
		for(int j=1; j<N+1; j++) {
			if(j == A[0][0]) {
				System.out.println(A[1][1]);
			}else {
				System.out.println(A[0][1]);
			}
		}
		keyboard.close();	
	}
}
