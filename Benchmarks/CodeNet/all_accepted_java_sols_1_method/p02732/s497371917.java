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
		  int n = sc.nextInt();
		  score[n]++;
		  k[i+1] = n;
	  }
	  for(int i=1; i<=N; i++) {
		  sum += score[i] * (score[i]-1) / 2;
	  }
	  //out.println(sum);
	  for(int i=1; i<=N; i++) {
		  long ans = sum - score[k[i]] + 1;
		  if (ans < 0 ) ans = 0;
		  out.println(ans);
	  }

  }
}

