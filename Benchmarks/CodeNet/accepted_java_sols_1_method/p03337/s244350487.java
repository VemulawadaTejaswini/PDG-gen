import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    int div = a - b;
    int mul = a * b;
    int ans;
    if (sum >= div && sum >= mul) {
      ans = sum;
    } else if (div >= mul) {
      ans = div;
    } else {
      ans = mul;
    }
    System.out.println(ans);
  }
}
