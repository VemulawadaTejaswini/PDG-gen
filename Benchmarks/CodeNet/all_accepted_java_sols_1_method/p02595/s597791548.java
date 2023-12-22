import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    int a = 0;
    for (int i = 1; i <= n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      if ((d*d) >= (x*x + y*y)) {
        a++;
      }
    }
    System.out.println(a);
  }
}
