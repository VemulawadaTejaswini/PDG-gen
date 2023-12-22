/* Volume0-0001(山の高さ) */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
   Scanner sc = new Scanner(System.in);

   Integer[] yama = new Integer[10];
   for(int i=0; i<10; i++) {
     yama[i] = sc.nextInt();
   }
   Arrays.sort(yama, Collections.reverseOrder());
   System.out.println(yama[0]);
   System.out.println(yama[1]);
   System.out.println(yama[2]);
 }
}

