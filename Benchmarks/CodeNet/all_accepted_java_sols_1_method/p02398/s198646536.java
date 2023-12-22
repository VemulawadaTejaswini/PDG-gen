import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    int b = stdin.nextInt();
    int c = stdin.nextInt();
    int cnt = 0;

    for (int i = a; i <= b; i++) {
      if (c % i == 0) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }

}