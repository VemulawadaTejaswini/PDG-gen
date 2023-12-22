import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int ans = a + a * a + (int) Math.pow(a, 3);
    System.out.println(ans);
    sc.close();
  }
}
