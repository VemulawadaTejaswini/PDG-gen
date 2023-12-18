import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      long n = Long.parseLong(st.nextToken());
      double m = Double.parseDouble(st.nextToken());
      long res = Math.round(m*100);
      long ans = res*n;
      out.println(ans/100);
      out.close();
   }
}
