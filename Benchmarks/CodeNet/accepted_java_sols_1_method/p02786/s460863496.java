import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    long ans = 1;
    while (n > 0) {
      ans = ans * 2;
      n = n / 2;
    }
    System.out.print(ans - 1);
  }
}
