import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count = 0;
    if (N >= 105) count++;
    if (N >= 135) count++;
    if (N >= 165) count++;
    if (N >= 189) count++;
    if (N >= 195) count++;
    System.out.println(count);
  }
}
