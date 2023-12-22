import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 1000 - (x % 1000);
    if (ans == 1000) {
      ans = 0;
    }
    System.out.println(ans);
    sc.close();
  }
}
