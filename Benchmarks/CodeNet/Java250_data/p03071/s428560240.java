import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  int getCoin(int great, int less) {
    if (great - less >= 2) {
      return great + great - 1;
    } else {
      return great + less;
    }
  }

  private void run() {
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());


    if (A > B) {
      System.out.println(getCoin(A, B));
    } else if (A < B) {
      System.out.println(getCoin(B, A));
    } else {
      System.out.println(A * 2);
    }
  }
}
