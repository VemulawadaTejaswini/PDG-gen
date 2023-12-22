import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    int N;
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int a,b,c;

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      if (a+b > c && a+c > b && b+c > a) {
        if (a*a+b*b == c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      } else {
        System.out.println("NO");
      }
    }
  }
}