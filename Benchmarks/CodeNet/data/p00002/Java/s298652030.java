import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextInt()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int val  = a+b;
      int cnt = 0;
      while(val > 0) {
        cnt++;
        val /= 10;
      }
      System.out.println(cnt);
    }
  }
}