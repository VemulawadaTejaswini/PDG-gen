import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    for (int i = 0; i < n; i ++) {
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      
      boolean result = (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b);
      System.out.println(result == true ? "YES" : "NO");
    }
  }

}