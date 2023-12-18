import java.io.*;

public class Main {

  static int n;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    br.close();

    System.out.println(n * n * n);

  }
}
