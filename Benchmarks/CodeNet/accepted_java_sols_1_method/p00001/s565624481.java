
/* Volume0-0001(山の高さ) */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
   Scanner sc = new Scanner(System.in);

   Integer[] foo = { sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt(),
                 sc.nextInt()};
   Arrays.sort(foo, Collections.reverseOrder());
   System.out.println(foo[0]);
   System.out.println(foo[1]);
   System.out.println(foo[2]);
 }
}
