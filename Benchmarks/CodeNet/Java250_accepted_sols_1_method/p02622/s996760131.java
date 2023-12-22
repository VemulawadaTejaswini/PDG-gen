import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      String s = st.nextToken();
      st = new StringTokenizer(br.readLine());
      String t = st.nextToken();
     int count = 0;
     for(int i = 0; i < s.length(); i++)
       if(s.charAt(i) != t.charAt(i))
         count++;
     out.println(count);
      out.close();
   }
}