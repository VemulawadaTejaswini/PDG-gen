import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String ans = "No";
    if(((c - a) * (c - b)) < 0) ans = "Yes";
    System.out.println(ans);
  }
}