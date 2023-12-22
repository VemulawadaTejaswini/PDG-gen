import java.util.*;
 
public class Main {
	public static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N+1];
        A[0] = 0;
        int borderA = 0;
        boolean keyA = true;
        for (int i = 1; i < N+1; i++) {
        	long Ai = sc.nextLong();
        	A[i] = Ai+A[i-1];
        	if (K < A[i] && keyA) {
        		borderA = i-1;
        		keyA = false;
        	} else if (i == N && keyA) {
        		borderA = i;
        	}
        }
        long[] B = new long[M+1];
        B[0] = 0;
        int borderB = 0;
        boolean keyB = true;
        for (int i = 1; i < M+1; i++) {
        	long Bi = sc.nextLong();
        	B[i] = Bi+B[i-1];
        	if ((K < B[i] || i == M) && keyB) {
        		borderB = i;
        		keyB = false;
        	} else if (i == N && keyB) {
        		borderB = i;
        	}
        }
        for (int i = 0; i <= borderA; i++) {
        	long res = K-A[i];
        	int jc = 0;
        	for (int j = borderB;-1 < j; j--) {
        		if (B[j] <= res) {
        			jc = j;
        			borderB = j;
        			break;
        		}
        	}
        	if (max < (i + jc)) {
        		max = i+jc;
        	}
        }
        System.out.println(max);
    }
}