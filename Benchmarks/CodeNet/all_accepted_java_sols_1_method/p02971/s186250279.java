import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  
	  int[] A = new int[N];
	  int max = 0;
	  int maxIndex = -1;
	  
	  int semimax = 0;
	  for(int i = 0; i < N; i++) {
		  int value = Integer.parseInt(sc.next());
		  A[i] = value;
		  
		  if(value > max) {
			  max = value;
			  maxIndex = i;
		  }
		  else if(value >= semimax) {
			  semimax = value;
		  }
	  }
	  
	  for(int i = 0; i < N; i++) {
		  if(i == maxIndex) {
			  System.out.println(semimax);
		  }
		  else {
			  System.out.println(max);
		  }
		  
	  }
	  
	  sc.close();
	  
  }
}
