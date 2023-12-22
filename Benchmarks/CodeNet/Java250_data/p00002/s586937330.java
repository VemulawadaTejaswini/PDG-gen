import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str;
    while ((str = buf.readLine()) != null) {
      String[] nums = str.split(" ");
      int sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
      System.out.println(Integer.toString(sum).length());
    }
  }
}