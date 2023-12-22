import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String result = 30 <= x ? "Yes" : "No";
    System.out.println(result);
    sc.close();
  }
}
