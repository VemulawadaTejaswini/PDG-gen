import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    long b = in.nextLong();
    long x = in.nextLong();

    long cnt = 0;

    long adiv = a/x;
    long bdiv = b/x;
    cnt = bdiv - adiv;
    if (a % x == 0) {
      cnt++;
    }

    //for (int i = a; i <= b; i++) {
    //  if (i % x == 0) {
    //    cnt++;
    //  }
    //}

    System.out.println(cnt);
  }
}