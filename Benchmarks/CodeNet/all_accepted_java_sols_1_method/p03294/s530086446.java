import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];
    long amount = 0;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    for(int i = 0; i < N; i++) {
      amount += a[i] - 1;
    }
    System.out.println(amount);

  }
}
