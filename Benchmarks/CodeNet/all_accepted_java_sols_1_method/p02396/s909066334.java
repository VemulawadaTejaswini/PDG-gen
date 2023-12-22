import java.io.*;
import java.util.Arrays;
   
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    int count = 1;
    while (!(input = br.readLine()).equals("0")) {
      System.out.println("Case " + count + ": " + input);
      count++;
    }
  }
}