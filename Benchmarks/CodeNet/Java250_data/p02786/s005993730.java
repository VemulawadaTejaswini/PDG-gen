import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    String two_bit = Long.toBinaryString(h);
    long ans = (long)Math.pow(2.0, (double)two_bit.length()) - (long) 1;
    System.out.println(ans);
  }
}