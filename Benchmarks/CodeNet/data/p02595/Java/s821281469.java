import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long D = sc.nextLong();
    int a = 0;
    for (int i = 0; i <= N; i++) {
      long X = sc.nextLong();
      long Y = sc.nextLong();
      if ((D*D) >= (X*X + Y*Y)) {
        a++;
      }
    }
    System.out.println(a);
  }
}
