import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();
    long M = scanner.nextLong();
    long count = 0;

    if (N == 1 && M ==1){
      count = 1;
    }
    if (N == 1 && M > 1){
      count = M - 2;
    }
    if (N > 1 && M == 1){
      count = N - 2;
    }
    if (N > 1 && M > 1){
      count = (N - 2) * (M - 2);
    }
    System.out.println(count);
  }
}
