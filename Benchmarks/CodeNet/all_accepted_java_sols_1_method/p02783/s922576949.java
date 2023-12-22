import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int A = scan.nextInt();
    scan.close();

    System.out.println(H%A == 0 ? H/A : H/A + 1);
  }
}