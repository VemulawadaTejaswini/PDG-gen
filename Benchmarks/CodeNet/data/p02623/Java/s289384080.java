import java.util.*;
 
public class Main {
	static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N+1];
        for (int i = 1; i < N+1; i++) {
        	int Ai = sc.nextInt();
        	A[i] = Ai;
        }
        int[] B = new int[M+1];
        for (int i = 1; i < M+1; i++) {
        	int Bi = sc.nextInt();
        	B[i] = Bi;
        }
        calc(0, K, true, A, B, 1, 1);
        calc(0, K, false, A, B, 1, 1);
        System.out.println(max);
    }
    
    private static void calc(int count, long K, boolean isA, int[] A, int[] B, int indexA, int indexB) {
    	if (isA) {
    		K -= A[indexA];
    		if (K < 0) {
    			if (max < count) {
    				max = count;
    			}
    			return;
    		}
    		indexA++;
    		count++;
    		if (indexA == A.length && indexB == B.length) {
    			if (max < count) {
    				max = count;
    			}
        		return;
    		} else if (indexA == A.length) {
    			calc(count, K, false, A , B, indexA, indexB);
    		} else if (indexB == B.length) {
    			calc(count, K, true, A , B, indexA, indexB);
    		} else {
        		calc(count, K, true, A , B, indexA, indexB);
        		calc(count, K, false, A , B, indexA, indexB);
    		}
    	} else {
    		K -= B[indexB];
    		if (K < 0) {
    			if (max < count) {
    				max = count;
    			}
    			return;
    		}
    		indexB++;
    		count++;
    		if (indexA == A.length && indexB == B.length) {
    			if (max < count) {
    				max = count;
    			}
        		return;
    		} else if (indexA == A.length) {
    			calc(count, K, false, A , B, indexA, indexB);
    		} else if (indexB == B.length) {
    			calc(count, K, true, A , B, indexA, indexB);
    		} else {
        		calc(count, K, true, A , B, indexA, indexB);
        		calc(count, K, false, A , B, indexA, indexB);
    		}
    	}
    }
}