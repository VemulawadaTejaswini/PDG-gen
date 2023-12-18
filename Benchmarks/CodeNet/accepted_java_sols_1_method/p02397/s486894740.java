
/* ITP1_3_C */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
   Scanner sc = new Scanner(System.in);

   // 入力データがなくなるまで繰り返す
   while (sc.hasNext()) {
     int x = sc.nextInt();  // 1個目をxにセット
     int y = sc.nextInt();  // 1個目をyにセット

     if((x==0)&&(y==0)) {
        // 処理をぬける
        break;
     } else {
       if(x < y) {
           System.out.println(x + " " + y);
       } else {
           System.out.println(y + " " + x);
       }
     }
   }
 }
}

