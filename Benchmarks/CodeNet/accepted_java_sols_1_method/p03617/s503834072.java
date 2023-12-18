import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    int Q = sc.nextInt();
    int H = sc.nextInt();
    int S = sc.nextInt();
    int D = sc.nextInt();
    int N = sc.nextInt();

    long amount = 0;
    int halfValue = Math.min(Q * 2, H);
    int literValue = Math.min(halfValue * 2, S);
    int twoLiterValue = Math.min(literValue * 2, D);  

    long twoLiterNum = N / 2;
    long literNum = N % 2;
    amount += twoLiterNum * twoLiterValue;
    amount += literNum * literValue;

    System.out.println(amount);
  }
}
