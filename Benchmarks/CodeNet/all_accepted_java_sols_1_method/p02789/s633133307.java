import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    String ans = N <= M ? "Yes" : "No";
    System.out.println(ans);
  }
}