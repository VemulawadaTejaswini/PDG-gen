import java.io.*;
import java.util.*;
public class Main {
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
	// write your code here
        MyScanner mc = new MyScanner();
        boolean game= false;
        int K = mc.nextInt(); int A = mc.nextInt(); int B = mc.nextInt();
        int count =0;
        while (count<=1000){
            if (count>=A&&count<=B){
                game = true;
            }
            count+=K;
        }
        if (count>=A&&count<=B){
            game = true;
        }
        pw.println(game?"OK":"NG");
        pw.flush();
    }

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
