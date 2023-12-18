import java.io.*;
   
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int a = Integer.parseInt(inputs[0]), b = Integer.parseInt(inputs[1]), c = Integer.parseInt(inputs[2]);
 
    if (a < b && b < c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}