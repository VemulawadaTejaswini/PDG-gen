import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    long A = scanner.nextLong();
    long V = scanner.nextLong();
    long B = scanner.nextLong();
    long W = scanner.nextLong();
    long T = scanner.nextLong();

    long speed = V - W;
    long dist = B - A;
    if(dist < 0 || speed <= 0) {
      System.out.println("NO");
      return;
    }

    System.out.println((dist - speed * T <= 0) ? "YES" : "NO");

              
  }

}
