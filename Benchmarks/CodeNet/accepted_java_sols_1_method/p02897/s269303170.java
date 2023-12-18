import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 2 == 0)
      System.out.println((double)(n / 2) / n);
    else
      System.out.println(((double)(n + 1) / 2) / n);
  }
}
