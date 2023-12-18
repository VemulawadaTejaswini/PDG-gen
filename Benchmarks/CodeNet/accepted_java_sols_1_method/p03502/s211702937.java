import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = String.valueOf(n);
    
    int x = 0;
    for (int i = 0; i < s.length(); i++) {
      x += Integer.parseInt(s.substring(i, i+1));
    }
    
    System.out.println((n % x) == 0 ? "Yes" : "No");
  }
}