import java.io.*;
import java.util.ArrayList;

// main

public class Main {
  static class Foo {
    private int val;

    Foo(int a, int b) {
      val = a + b;
    }

    int getVal() { return val; }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    while ((line = br.readLine()) != null) {
      String[] nums = line.split(" ");
      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);

      Foo foo = new Foo(a, b);
      System.out.println(foo.getVal());
    }
  }
}