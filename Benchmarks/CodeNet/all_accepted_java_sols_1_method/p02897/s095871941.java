import java.util.Scanner;

class Main {
  public static void main(String argv[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    System.out.println((n % 2 == 0 ? n/2:n/2 + 1) / (double)n);
  }
}