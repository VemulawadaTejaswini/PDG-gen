import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int AB = A + B;
    if (AB < 10) {
      System.out.println(AB);
    }else {
      System.out.println("error");
    }
  }
}
