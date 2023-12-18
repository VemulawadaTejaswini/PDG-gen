import java.util.Scanner;

public class Main {
  public static final int BIG_NUM = 2000000000;
  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);
    int N = scanInt.nextInt();
    int num, max = -BIG_NUM, min = BIG_NUM;
    for(int i = 0; i < N; i++){
      num = scanInt.nextInt();
      max = Math.max(max, num - min);
      min = Math.min(min, num);
    }

    System.out.println(max);
  }
}

