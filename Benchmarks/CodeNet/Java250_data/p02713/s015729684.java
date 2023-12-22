import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {

  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int sum = 0;

    if (num == 1) {
      System.out.println('1');
      return;
    }

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        for (int k = 1; k <= num; k++) {
          int[] test = {i, j, k};
          sum += gcd(test);
        }
      }
    }

    System.out.println(sum);
  }

  private static int gcd(int[] num) {
    int ans = num[0];

    for (int i = 1; i < num.length; i++) {
      ans = func(ans, num[i]);
    }
    return ans;
  }

  private static int func(int a, int b) {

    if (b != 0) {
      return func(b, a % b);
    } else {
      return a;
    }
  }
}
