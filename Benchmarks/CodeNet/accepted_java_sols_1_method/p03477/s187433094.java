import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ab = sc.nextInt() + sc.nextInt();
    int cd = sc.nextInt() + sc.nextInt();
    sc.close();

    if (ab == cd) {
      System.out.println("Balanced");
    } else if (ab > cd) {
      System.out.println("Left");
    } else {
      System.out.println("Right");
    }

  }
}