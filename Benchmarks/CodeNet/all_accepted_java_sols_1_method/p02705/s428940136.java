import java.io.*;

public class Main {

  static double n;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Double.parseDouble(in[0]);

    br.close();

    System.out.println(2.0 * n * 3.141592);
  }
}