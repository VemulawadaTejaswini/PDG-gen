import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
    
      	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.nextLine());
      	String[] strA = sc.nextLine().split("\\s");
      	String[] strB = sc.nextLine().split("\\s");
      	String[] strC = sc.nextLine().split("\\s");
      	
      	int[] A = new int[N];
      	int[] B = new int[N];
      	int[] C = new int[N-1];
       	
      	for(int i = 0; i < N; i++){
      	    A[i] = Integer.parseInt(strA[i]);
      	    B[i] = Integer.parseInt(strB[i]);
      	    if(i != N-1) C[i] = Integer.parseInt(strC[i]);
      	}
      	
      	int total = Arrays.stream(B).sum();
      	
      	for(int i = 0; i < N; i++){
      	    if( (i > 0) && (A[i-1] + 1 == A[i]) ){
      	        total += C[A[i-1] -1];
      	    }
      	}
      	
      	System.out.println(total);
      	
      	
    }
}