import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int max = 0;
    for (int i = 1; i < Math.sqrt(n) + 1; i++)
      if (n % i == 0)
        max = i;
    System.out.println(max + n / max - 2);
  }
}