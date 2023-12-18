import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int rem = N % 1000;
    System.out.println(rem == 0 ? 0 : 1000 - rem);
  }
}