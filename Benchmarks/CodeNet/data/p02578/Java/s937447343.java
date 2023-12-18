import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int max = 0;
    long ans = 0;

    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      max = Math.max(max, tmp);
      ans += max - tmp;
    }

    System.out.println(ans);
  }
}