import java.io.*;
import java.util.*;
 
class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] nums = str.split("");
    int min = 1000;
    int best = 753;
    for (int i = 0; i + 2 < str.length(); i++) {
      String num = nums[i] + nums[i+1] + nums[i+2];
      int diff = Math.abs(best - Integer.parseInt(num));
      if (diff < min) min = diff; 
      if (min == 0) break;
    }
    System.out.print(min);
	}
}