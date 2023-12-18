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
      int xor = 0;
      for(int i = 0; i < n; i++) {
    	  a[i] = Integer.parseInt(st.nextToken());
    	  xor = xor ^ a[i];
      }
      StringJoiner sj = new StringJoiner(" ");
      for(int i = 0; i < n; i++)
    	  sj.add(Integer.toString(a[i] ^ xor));
      out.println(sj);
      out.close();
   }
}