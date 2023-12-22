import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    StringBuilder builder = new StringBuilder();
    for (int i = X - K + 1; i <= X + K - 1; i++)
      builder.append(i).append(' ');
    System.out.println(builder.toString().trim());
  }
}