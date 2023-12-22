import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scan_ = new Scanner(System.in);
    int howMany_ = scan_.nextInt();
    long total = 0;
    int[] ints = new int[howMany_];
    for(int i = 0; i < howMany_ ; i++) {
      ints[i] = scan_.nextInt();
     }
     Arrays.sort(ints);
    for(int i = 0; i < howMany_ ; i++) {
     total += ints[i];
     }
     System.out.println(ints[0] + " " + ints[howMany_ - 1] + " "  + total);
  }
}
