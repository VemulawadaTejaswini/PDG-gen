import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] A = new int[N];
	for (int i=0;i<N;i++) {
	    A[i] = sc.nextInt();
	}
	Arrays.sort(A);
	int[] B = new int[N];
	boolean[] isM = new boolean[N];
	int nowM = 0;
	int nowP = N-1;
	for (int i=0;i<N;i++) {
	    if (Math.abs(A[nowM]) <= Math.abs(A[nowP])) {
		B[i] = A[nowP];
		nowP--;
		isM[i] = false;
	    }
	    else {
		B[i] = A[nowM];
		nowM++;
		isM[i] = true;
	    }
	}
	int seki = 1;
	boolean isStack = false;
	int stack = 1;

	for (int i=0;i<N;i++) {
	    if (isM[i]) {
		if (isStack) {
		    seki = seki * stack * B[i] % 1000000007;
		    K -= 2;
		    isStack = false;
		} else {
		    stack = B[i];
		    isStack = true;
		}
	    } else {
		seki = seki*B[i] % 1000000007;
		K--;
	    }
	    if (K == 0) break;
	}
	System.out.print(seki);
    }
}
