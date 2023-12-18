import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int moneyA = sc.nextInt();
    int moneyB = sc.nextInt();
    int target = sc.nextInt();
    String result = moneyA+moneyB >= target ? "Yes" : "No" ;
    System.out.println(result);
    }
}
