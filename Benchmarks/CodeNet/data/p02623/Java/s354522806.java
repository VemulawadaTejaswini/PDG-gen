import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int M = s.nextInt();
	int K = s.nextInt();
	long[] A = new long[N+1];
	long[] B = new long[M+1];
	for(int i = 1; i <= N; i++){
		A[i] = s.nextInt()+A[i-1];
	}
	for(int i = 1; i <= M; i++){
		B[i] = s.nextInt()+B[i-1];
	}
	long bestCount = 0;
	long Sum = 0;
	int x = 0;
	int y = 0;
	for(int i = 0; i <= N; i++){
		if(A[i] > K) break;
		for(int j = M; j >= 0; j--){
			Sum = B[j]+A[i];
			if(K >= Sum){
				bestCount = Math.max(bestCount, j+i);
				break;
			}
		}
	}

	System.out.println(bestCount);
    
  }
}