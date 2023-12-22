import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1つ目
    int a = sc.nextInt();
    // 2つ目
    int b = sc.nextInt();

    if (a == b) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}