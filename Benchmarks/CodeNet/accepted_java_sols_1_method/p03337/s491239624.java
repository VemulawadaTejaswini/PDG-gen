import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] value = br.readLine().split(" ");
    int a = Integer.parseInt(value[0]);
    int b = Integer.parseInt(value[1]);

    System.out.println(Math.max(a * b, Math.max(a + b, a - b))); 
  }
}
