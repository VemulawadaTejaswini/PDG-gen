import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String ans = "Yes";
    if(x < 30) ans = "No";
    System.out.println(ans);
  }
}