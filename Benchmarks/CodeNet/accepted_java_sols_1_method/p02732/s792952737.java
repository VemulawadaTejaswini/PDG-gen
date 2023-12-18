import java.util.*;
import static java.lang.System.*;

import java.io.IOException;
import java.io.InputStream;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  long[]score = new long[N+1];
	  int[] k = new int[N+1];
	  long sum = 0;
	  
	  for(int i=0; i<N; i++) {
		  k[i]= sc.nextInt();
		  score[k[i]]++;
	  }
	  for(int i=1; i<=N; i++) {
		  sum += (score[i] * (score[i]-1)) / 2;
	  }

	  for(int i=0; i<N; i++) {
		  long ans = sum - score[k[i]] + 1;
		  out.println(ans);
	  }

  }
}