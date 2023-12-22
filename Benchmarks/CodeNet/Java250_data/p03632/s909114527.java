import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());

    int ans = Math.min(B, D) - Math.max(A, C);
    System.out.println(Math.max(ans, 0));
  }
}
