
/* ITP1_2_D */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
   Scanner sc = new Scanner(System.in);

   int W = sc.nextInt();  // 1個目をWにセット
   int H = sc.nextInt();  // 1個目をHにセット
   int x = sc.nextInt();  // 1個目をxにセット
   int y = sc.nextInt();  // 1個目をyにセット
   int r = sc.nextInt();  // 1個目をrにセット

   if( ((x + r) <= W) && ((y + r) <= H) && ((x - r) >= 0) && ((y - r) >= 0) ) {
       System.out.println("Yes");
   } else {
       System.out.println("No");
   }
 }
}

