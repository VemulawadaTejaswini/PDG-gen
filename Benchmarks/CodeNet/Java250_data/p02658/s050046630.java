import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      long n = Long.parseLong(st.nextToken());
     st = new StringTokenizer(br.readLine());
     long prod = 1;
     boolean fail = false;
      for(int i = 0; i < n; i++){
        long next = Long.parseLong(st.nextToken());
        if(next == 0){
          prod = 0;
          fail = false;
          break;
        }
        if(((long)Math.pow(10,18))/prod < next){
          fail = true;
        }
        else
          prod *= next;
      }
     if(fail)
       out.println(-1);
     else
       out.println(prod);
      out.close();
   }
}

