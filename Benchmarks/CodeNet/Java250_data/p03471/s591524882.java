import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt() / 1000;
    for (int i = 0; i <= Y / 10; i++) {
      for (int j = 0; j <= Y / 5; j++) {
        if (i * 10 + j * 5 > Y || i + j > N) {
          break;
        }
        for (int k = 0; k <= Y; k++) {
          if (i * 10 + j * 5 + k > Y || i + j + k > N) {
            break;
          }
          if (i * 10 + j * 5 + k == Y && i + j + k == N) {
            System.out.println(String.format("%d %d %d", i, j, k));
            return;
          }
        }
      }
    }
    System.out.println("-1 -1 -1");
  }

}
