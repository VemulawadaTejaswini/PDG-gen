import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s[] = (new String(in.readLine())).split(" ");
    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1]);
    int c;
    
    c = (int)Math.ceil((N - 1.0) / (K - 1.0));
      
    System.out.println(c);
  }
}
