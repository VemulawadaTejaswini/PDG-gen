import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String ans = x >= 30 ? "Yes" : "No";
    System.out.println(ans);
    sc.close();
  }
}