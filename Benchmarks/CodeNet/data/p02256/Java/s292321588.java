import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    printGCM(a, b);;
  }

  private static void printGCM(int a, int b) {
    if (b == 0) {
      System.out.println(a);
    } else {
      printGCM(b, a % b);
    }
  }
}
