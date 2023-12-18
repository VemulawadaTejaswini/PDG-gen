import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int max = M / N;
    for (int i = max; i > 0; i--) {
      if (M % i == 0 && M / i >= N) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(1);

  }
}