import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int[] a = new int[n];
      long sum = 0;
      HashMap<Integer,Long> freq = new HashMap<Integer,Long>();
      for(int i = 0; i < n; i++) {
    	  a[i] = Integer.parseInt(st.nextToken());
    	  sum += a[i];
    	  if(freq.keySet().contains(a[i]))
    		  freq.put(a[i],freq.get(a[i])+1);
    	  else
    		  freq.put(a[i],(long)1);
      }
      st = new StringTokenizer(br.readLine());
      int q = Integer.parseInt(st.nextToken());
      for(int i = 0; i < q; i++) {
          st = new StringTokenizer(br.readLine());
          int b = Integer.parseInt(st.nextToken());
          int c = Integer.parseInt(st.nextToken());
    	  if(freq.keySet().contains(b)) {
    		  sum += freq.get(b)*(c-b);
    		  if(freq.keySet().contains(c)) {
    			  freq.put(c, freq.get(c) + freq.get(b));
    		  }
    		  else
    			  freq.put(c,freq.get(b));
              freq.remove(b);
    	  }
    	  out.println(sum);
      }
      out.close();
   }
}