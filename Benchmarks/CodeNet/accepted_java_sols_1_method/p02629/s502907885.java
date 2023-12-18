import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      long[] pow = new long[11];
      pow[0] = 26;
      for(int i = 1; i < 11; i++)
    	  pow[i] = 26*pow[i-1];
     long n = Long.parseLong(st.nextToken());
     int i = 0;
     while(n > pow[i]) {
    	 n -= pow[i];
    	 i++;
     }
     String ans = "";
     n--;
     while(i >= 0) {
    	 ans = (char)(97 + n%26) + ans;
    	 n /= 26;
    	 i--;
     }
     out.println(ans);
      out.close();
   }
}
