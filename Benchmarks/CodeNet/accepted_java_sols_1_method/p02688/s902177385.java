import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int s[] = new int[N];

    for (int i = 0; i < K; i++) {
      int d = scan.nextInt();
      for (int y = 0; y < d; y++) {
        int A = scan.nextInt();
        s[A - 1]++;
      }
    }

    System.out.println(Arrays.stream(s).filter(i -> i == 0).count());
  }
}