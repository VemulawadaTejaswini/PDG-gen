import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    int d1 = sc.nextInt();
    int m2 = sc.nextInt();
    int d2 = sc.nextInt();
    if( d1 > d2 && m1 < m2) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
}
}
