import java.util.*;

public class Main {
  public static void main(String[] args) {
    int a;
    int b;
    try(Scanner sc = new Scanner(System.in)) {
      a = sc.nextInt();
      b = sc.nextInt();
    }
    int am;
    int bm;
    am = a % 2;
    bm = b % 2;
    if ( am == bm ) {
      System.out.println((a+b)/2);
    }
    else {
      System.out.println("IMPOSSIBLE");
    }
  }
}