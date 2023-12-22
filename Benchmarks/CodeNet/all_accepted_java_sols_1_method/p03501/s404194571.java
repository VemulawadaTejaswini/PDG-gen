import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    int NA = N * A;
    if (NA > B) {
      System.out.println(B);
    }else {
      System.out.println(NA);
    }
  }
}
