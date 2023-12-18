import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, turi, mai;
    N = sc.nextInt();
    if (N % 1000 == 0)
      mai = N / 1000;
    else
      mai = N / 1000 + 1;
    turi = 1000 * mai - N;
    System.out.print(turi);
  }
}