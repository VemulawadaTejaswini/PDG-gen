import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
     long[] a = new long[n+1];
      st = new StringTokenizer(br.readLine());
      for(int i = 1; i <= n; i++)
        a[i] = Long.parseLong(st.nextToken()) + a[i-1];
       st = new StringTokenizer(br.readLine());
     long[] b = new long[m+1];
     int j = 1;
     int max = 0;
      for(int i = 1; i <= m; i++){
        b[i] = Long.parseLong(st.nextToken()) + b[i-1];
        if(b[j] <= k)
          j++;
      }
     j--;
     for(int i = 0; i <= n; i++){
       if(a[i] + b[j] <= k)
         max = Math.max(i+j, max);
       else if(j == 0)
         break;
       else
         j--;
     }
     out.println(max);
      out.close();
   }
}