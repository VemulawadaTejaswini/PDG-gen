import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans;
    if (S.equals("Sunny")) {
      ans = "Cloudy";
    } else if (S.equals("Cloudy")) {
      ans = "Rainy";
    } else {
      ans = "Sunny";
    }
    System.out.println(ans);
  }
}