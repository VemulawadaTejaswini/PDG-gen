/* ITP1_2_B */


import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
    Scanner sc = new Scanner(System.in);

    // 入力データがなくなるまで繰り返す
    while (sc.hasNext()) {
      // 入力データをセット
      int a = sc.nextInt();  // 1個目をaにセット
      int b = sc.nextInt();  // 2個目をbにセット
      int c = sc.nextInt();  // 3個目をcにセット
    }

    if((a < b) && (b < c)) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }
}


