import java.io.*;
 
// main
 
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
 
    while ((line = br.readLine()) != null) {
      String[] nums = line.split(" ");
      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);
      System.out.println(a+b);
    }
  }
}
