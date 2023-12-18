import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      long a1 = 0, a2 = 0;
      long xor = 0;
      for(int i = 0; i < n; i++) {
    	  long a = Long.parseLong(st.nextToken());
    	  if(i == 0)
    		  a1 = a;
    	  else if(i == 1)
    		  a2 = a;
    	  else
    		  xor = a ^ xor;
      }
      long sum = a1 + a2;
      long res = 0;
      TreeSet<Long> one = new TreeSet<Long>();
      boolean works = true;
      long pow = 1;
      while(sum > 0) {
    	  if(sum%2 == xor%2) {
    		  if(sum%2 == 1)
    			  one.add(pow);
    		  else {
    			  if(sum%4 != xor%4) {
	    			  res += pow;
	    			  sum -= 2;
    			  }
    		  }
    	  }
    	  else {
    		  works = false;
    		  break;
    	  }
    	  sum /= 2;
    	  xor /= 2;
    	  pow *= 2;
      }
      if(!works || res >= a1)
    	  out.println(-1);
      else {
    	  while(one.size() > 0) {
    		  pow = one.pollLast();
    		  if(res + pow < a1)
    			  res += pow;
    	  }
    	  out.println(a1 - res);
      }
      out.close();
   }
}