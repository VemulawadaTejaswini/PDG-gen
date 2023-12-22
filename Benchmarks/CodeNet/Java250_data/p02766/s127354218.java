import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    long N = Long.parseLong(sc.next());
    int K = Integer.parseInt(sc.next());

    long num = N;
    int digits = 1;
    while (true) {
      num /= K;
      if (num == 0) {
        break;
      }
      digits++;
      if (num == 1) {
        break;
      }
    }
    System.out.println(digits);
  }
}
