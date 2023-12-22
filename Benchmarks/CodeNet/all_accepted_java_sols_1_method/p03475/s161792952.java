import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  
	  int[] C = new int[N];
	  int[] S = new int[N];
	  int[] F = new int[N];
	  
	  for(int i = 0; i < N-1; i++) {
		  C[i] = Integer.parseInt(sc.next());
		  S[i] = Integer.parseInt(sc.next());
		  F[i] = Integer.parseInt(sc.next());
	  }
	  
	  int[] temp = new int[N];
	  C[N-1] = S[N-1] = F[N-1] = 0;
	  for(int i = 0; i < N; i++) {
		  temp[i] = S[i] + C[i];
		  for(int j = i+1; j < N-1; j++) {
			  temp[i] = Math.max(S[j], ((temp[i] + F[j] - 1) / F[j]) * F[j]);
			  temp[i] += C[j];
		  }
		  
		  System.out.println(temp[i]);
	  }
	  sc.close();
	  
  }
}