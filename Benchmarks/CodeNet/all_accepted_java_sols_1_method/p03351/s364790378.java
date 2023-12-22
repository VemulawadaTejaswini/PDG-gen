import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int ab = Math.abs(b - a);
    int bc = Math.abs(c - b);
    int ca = Math.abs(a - c);
    
    if (ca <= d) {
      System.out.println("Yes");
      return;
    }
    
    if (ab <= d && bc <= d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}