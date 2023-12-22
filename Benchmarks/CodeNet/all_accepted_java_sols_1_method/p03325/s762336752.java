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

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    long opCnt = 0;
    for (int i = 0; i < N; i++) {
      int tmp = a[i];
      while(tmp % 2 == 0){
        tmp = tmp / 2;
        opCnt++;
      }
    }

    System.out.println(opCnt);
  }
}
