import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    if (a != 0) {
      if (b != 0) {
        if (c != 0) {
          if (d != 0) {
            if (e == 0) {
              System.out.println(5);
            }
          } else {
            System.out.println(4);
          }
        } else {
          System.out.println(3);
        }
      } else {
        System.out.println(2);
      }
    } else {
      System.out.println(1);
    }
  }
}