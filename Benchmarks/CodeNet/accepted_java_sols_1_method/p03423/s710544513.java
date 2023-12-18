import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n, x;

      n = Integer.parseInt(reader.readLine());
      x = n/3;

      System.out.println(x);
    }
    catch (Exception e) {
      
    }
  }
}