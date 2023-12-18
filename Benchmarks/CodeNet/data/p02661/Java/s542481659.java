import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int[] a = new int[n];
      int[] b=  new int[n];
      for(int i = 0; i < n; i++) {
          st = new StringTokenizer(br.readLine());
          a[i] = Integer.parseInt(st.nextToken());
          b[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(a);
      Arrays.sort(b);
      if(n%2 == 1)
    	  out.println(b[n/2]-a[n/2]+1);
      else
    	  out.println(b[n/2]+b[n/2-1] - a[n/2]-a[n/2-1] + 1);
      out.close();
   }
}