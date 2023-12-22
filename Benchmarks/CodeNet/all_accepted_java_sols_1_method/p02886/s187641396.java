import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    int sum = 0;
    int tmp;
    for (int i = 0; i < n; i++) {
      result += sum * (tmp = sc.nextInt());
      sum += tmp;
    }
    System.out.println(result);
  }
}