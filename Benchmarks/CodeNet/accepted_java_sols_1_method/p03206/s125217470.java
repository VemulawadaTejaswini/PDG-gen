import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    String ans = "Christmas";
    if (D == 24) {
      ans += " Eve";
    } else if (D == 23) {
      ans += " Eve Eve";
    } else if (D == 22) {
      ans += " Eve Eve Eve";
    }
    System.out.println(ans);
  }
}