import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long[] arrayA = new long[N + 1];
    long result = 0;
    for (int i = 0; i < N + 1; i++) {
      arrayA[i] = scan.nextLong();
    }
    for (int i = 0; i < N; i++) {
      long tmp = scan.nextLong();

      if (tmp >= arrayA[i]) {
        result += arrayA[i];
        tmp -= arrayA[i];
      } else {
        result += tmp;
        continue;
      }
      if (tmp >= arrayA[i + 1]) {
        result += arrayA[i + 1];
        arrayA[i + 1] = 0;
      } else {
        result += tmp;
        arrayA[i + 1] -= tmp;
      }

    }

    System.out.println(result);
  }

}
