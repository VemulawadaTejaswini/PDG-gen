import java.util.*;
import java.io.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] nums = new long[n+1];
    nums[0] = 2;
    nums[1] = 1;
    for(int i = 2; i <= n; i++) {
      nums[i] = nums[i-2] + nums[i-1];
    }
    System.out.println(nums[n]);
  }
}
