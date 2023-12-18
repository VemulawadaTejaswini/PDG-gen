import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1つ目の整数
    int a = sc.nextInt();
    // 2つ目の整数
    int b = sc.nextInt();

    int multi = a * b;

    String result;
    if (multi % 2 == 0) {
      result = "Even";
    } else {
      result = "Odd";
    }

    System.out.println(result);
  }
}
