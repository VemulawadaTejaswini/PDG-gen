import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int n = 0;
    int m = 0;

    String s = "NO";
    if (a == 5 && b == 5 && c == 7) {
      s = "YES";
    }
    if (a == 5 && b == 7 && c == 5) {
      s = "YES";
    }
    if (a == 7 && b == 5 && c == 5) {
      s = "YES";
    }
    
    System.out.println(s);
  }
}