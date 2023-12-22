import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  int maxInt = 0;
	  int secondInt = 0;
	  boolean isEqual = false; //同じ値の最大値が２以上あるか
	  for(int i=0; i<N; i++) {
		  A[i] = sc.nextInt();
		  if (maxInt < A[i]) {
			  secondInt = maxInt;
			  maxInt = A[i];
			  isEqual = false;
		  } else if  (maxInt == A[i]){
			 isEqual = true;
		  } else {
			  if(A[i] > secondInt)
				  secondInt = A[i];
		  }
	  }
	  
	  for(int i=0; i<N; i++) {
		  if (maxInt > A[i]) {
			  out.println(maxInt);
		  } else if (isEqual) {
			  out.println(maxInt);
		  } else {
			  out.println(secondInt);
		  }
	  }
	  
  }
}