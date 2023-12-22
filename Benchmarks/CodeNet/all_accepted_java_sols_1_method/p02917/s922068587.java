import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  
	  int[] B = new int[N-1];
	  for(int i = 0; i < B.length; i++)
		  B[i] = Integer.parseInt(sc.next());
	  
	  int A = B[0] + B[B.length-1];
	  for(int i = 1; i < B.length; i++) {
		  A += Math.min(B[i-1], B[i]);
	  }
	  System.out.println(A);
	  sc.close();
	  
  }
}
