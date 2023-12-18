import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int V = scanner.nextInt();
    int B = scanner.nextInt();
    int W = scanner.nextInt();
    int T = scanner.nextInt();

    int speed = V - W;
    int dist = B - A;
    if(speed <= 0) {
      System.out.println("NO");
      return;
    }

    System.out.println((dist - speed * T <= 0) ? "YES" : "NO");

              
  }

}
