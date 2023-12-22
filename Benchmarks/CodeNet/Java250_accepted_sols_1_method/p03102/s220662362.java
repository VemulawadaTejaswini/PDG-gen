import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int C = sc.nextInt();
    	int[] B = new int[M];
    	for (int i = 0; i < M; i++) {
    		B[i] = sc.nextInt();
    	}
    	List<int[]> Ai = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
    		int[] A = new int[M];
    		for (int j = 0; j < M; j++) {
    			A[j] = sc.nextInt();
    		}
    		Ai.add(A);
    	}
    	int count = 0;
    	for (int i = 0; i < Ai.size(); i++) {
    		int[] A = Ai.get(i);
    		int clear = C;
    		for (int j = 0; j < M; j++) {
    			clear += A[j] * B[j];
    		}
    		if (0 < clear) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}