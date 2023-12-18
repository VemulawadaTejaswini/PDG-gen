import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int A=sc.nextInt();
      int B=sc.nextInt();
      int H=sc.nextInt();
      int M=sc.nextInt();
      int sec=3600*H+60*M;

      double hang=sec*2.0*Math.PI/(12*3600.0);
      double mang=sec*2.0*Math.PI/3600;
      double ang=Math.abs(hang-mang);
      double ans=Math.sqrt(A*A+B*B-2.0*A*B*Math.cos(ang));

      out.println(String.format("%.12f", ans));

      out.close();
   }

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
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