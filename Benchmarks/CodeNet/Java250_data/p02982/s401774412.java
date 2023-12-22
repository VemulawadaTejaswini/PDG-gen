import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      int d = sc.nextInt();
      int[] coords = new int[n * d];
      int match = 0;
      for(int i = 0; i < coords.length; i++)
        coords[i] = sc.nextInt();
      for(int i = 0; i <= coords.length - 2 * d; i += d)
      {
          for(int j = i + d; j <= coords.length - d; j += d)
          {
              int sum = 0;
              for(int k = 0; k < d; k++)
                sum += Math.pow(Math.abs(coords[i + k] - coords[j + k]), 2);
              double dist = Math.sqrt(sum);
              if(dist == (int) (dist))
                match++;
          }
      }
      out.println(match);      
      //end
      out.close();
   }
 
   public static PrintWriter out;
      
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
      long nextLong() {
          return Long.parseLong(next());
      }
      double nextDouble() {
          return Double.parseDouble(next());
      }
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }
   }
}