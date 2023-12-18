import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    System.out.println(num * num * num);
  }
}
