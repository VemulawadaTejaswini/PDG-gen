import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int taro = 0;
    int hanako = 0;
    for (int i = 0; i < n; i++) {
      String a = stdin.next();
      String b = stdin.next();
      if (a.compareTo(b) > 0) {
        taro += 3;
      } else if (a.compareTo(b) < 0) {
        hanako += 3;
      } else {
        taro++;
        hanako++;
      }
    }

    System.out.printf("%d %d%n", taro, hanako);
  }

}