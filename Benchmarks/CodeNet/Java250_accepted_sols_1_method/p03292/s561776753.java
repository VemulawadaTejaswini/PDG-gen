import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int[] nums = new int[3];
    
    for (int i = 0; i < strs.length; i++) {
      nums[i] = Integer.parseInt(strs[i]);
    }
    Arrays.sort(nums);
    System.out.println((nums[2] - nums[1]) + (nums[1] - nums[0]));
    
  }
}