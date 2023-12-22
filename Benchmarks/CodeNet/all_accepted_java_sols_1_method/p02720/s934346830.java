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

    final int k = sc.nextInt();
    // 途中計算用配列
    final Queue<BigInteger> tempList = new ArrayDeque<BigInteger>();
    // 解答用配列
    final ArrayList<BigInteger> ans = new ArrayList<BigInteger>();

    if (k < 10) {
      System.out.println(k);
      return;
    } else {
      for (int i = 1; i < 10; i++) {
        tempList.add(BigInteger.valueOf(i));
      }
    }

    while (ans.size() <= k) {

      BigInteger temp = tempList.poll();
      BigInteger num1 = temp.remainder(BigInteger.valueOf(10));
      BigInteger num2 = temp.multiply(BigInteger.valueOf(10)).add(num1);

      ans.add(temp);

      // 一の位が0でない場合、num - 1の値もセット
      if (num1.compareTo(BigInteger.valueOf(0)) != 0) {
        tempList.add(num2.subtract(BigInteger.valueOf(1)));
      }

      tempList.add(num2);

      // 一の位が9でない場合、num + 1の値もセット
      if (num1.compareTo(BigInteger.valueOf(9)) != 0) {
        tempList.add(num2.add(BigInteger.valueOf(1)));
      }
    }

    System.out.println(ans.get(k - 1));
  }
}