import java.util.*;

class Main{
  static int n,x;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int i = 3;
    while (i<=n) {
      x = i;
      if (i % 3 == 0) {
        System.out.printf(" %d",i);
      } else {
      while (x>=1) {
        if (x % 10 == 3) {
          System.out.printf(" %d",i);
          break;
        }
          x /= 10;
        }
      }
      i++;
    }
    System.out.println("");
  }
}
