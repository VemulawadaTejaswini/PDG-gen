// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class Main{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = "";
    for(int i = 0; i < 3; i++)
      num += sc.next();
    int n = Integer.parseInt(num);
    if(n % 4 == 0) System.out.println("YES");
    else System.out.println("NO");
  }
}
