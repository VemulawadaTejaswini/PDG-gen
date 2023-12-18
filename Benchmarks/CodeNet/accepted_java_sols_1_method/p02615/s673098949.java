import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	long[] A = new long[N];
      	for (int i=0; i<N; i++) {
        	A[i] = sc.nextLong();
        }
      	Arrays.sort(A);
      	long sum = 0;
      	for (int i=0; i<N-1; i++) {
        	sum += A[N - 1 - (i+1)/2];
        }
      	System.out.println(sum);
    }
}