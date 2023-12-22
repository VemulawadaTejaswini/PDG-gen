import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    int area1 = a * b;
    int area2 = c * d;
    if(area1 >= area2) {
      System.out.println(area1);
    } else {
      System.out.println(area2);
    }
  }
}