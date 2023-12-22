import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int K = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    long ans = 0;
    if (A + 1 < B && A < K) {
      int times = (K - (A - 1)) / 2;
      ans = A + (long)(B - A) * times + (K - (A - 1)) % 2;
    } else {
      ans = K + 1;
    }

    System.out.println(ans);
  }

}