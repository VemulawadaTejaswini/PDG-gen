import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.next());
      	int K = Integer.parseInt(sc.next());
      	int[] A = new int[N];
      	for (int i=0; i<N; i++) {A[i] = Integer.parseInt(sc.next());}
      
      	double per;//a_i+k-1 / a_i-1
      	
      	for (int i = 1; i < N - K + 1; i++) {
            	per = ((double)A[i + K - 1]) / ((double)A[i - 1]);
              	if (per > 1) {
              	System.out.println("Yes");
            	} else {System.out.println("No");}
        }
	}
}