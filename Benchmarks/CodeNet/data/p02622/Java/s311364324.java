 import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

  public static void main(String[] args){
    InputReader in = new InputReader();
    String a = in.next();
    String b = in.next();
    if(a.equals(b)){
      System.out.println(0);
    }
    else{
      char[] arr_a = a.toCharArray();
      char[] arr_b = b.toCharArray();
      int n = arr_a.length;
      int ans= 0;
      for(int i=0;i<n;i++){
        if(arr_a[i]!=arr_b[i]){
          ans++;
        }
      }
      System.out.println(ans);
    }
    
    
  }
static class InputReader {
		public BufferedReader reader;
		public StringTokenizer st;
 
		public InputReader() {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}
 
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}
 
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
 
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}


}

 
