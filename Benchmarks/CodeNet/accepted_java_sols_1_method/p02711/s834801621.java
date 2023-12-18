import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "No";
    for(int i = 0; i < 3; i++) {
      int d = n % 10;
      n /= 10;
      if(d == 7) ans = "Yes";
    }
    System.out.println(ans);
  }
}