import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    String ans;
    ans = (s * t >= d) ? "Yes" : "No";
    System.out.println(ans);
    sc.close();
  }
}
