import java.io.*;
import java.util.*;


public class Main{
	
	public static void main(String[] args){
	
	MyScanner sc = new MyScanner();
	out = new PrintWriter(new BufferedOutputStream(System.out));
	
	/**/

	int n = sc.nextInt();
	long[] array = new long[n];
	long sum = 0;
	
	for(int i = 0; i < array.length; i++){
		
		array[i] = sc.nextInt();
		
	}
	
	for(int i = 0; i < array.length - 1; i++){
		
		for(int i2 = i + 1; i2 < array.length; i2++){
			sum += array[i] * array[i2];
		}
		
	}
	System.out.println(sum % (10*10*10*10*10*10*10*10*10 + 7));
	
	/**/
	 
	 out.close();	
	}
	
	
	
	public static PrintWriter out;
	
	public static class MyScanner{
		
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner(){
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
