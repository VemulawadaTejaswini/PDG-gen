import java.util.*;
import java.io.*;

class Main{
  static boolean found = false;
  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st  = new StringTokenizer(br.readLine());

    String s = br.readLine();

    long sum = 0;
    for (int i=0; i<s.length(); i++) {
      sum+= Character.getNumericValue(s.charAt(i));
      sum = sum%9;
    }
    if (sum%9==0) {
      out.println("Yes");
    }
    else {
      out.println("No");
    }
    out.close();
  }

  
}








