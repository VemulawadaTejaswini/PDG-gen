import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    for(int i = 0; i < m; i++) {
      sc.nextInt();
      sc.nextInt();
    }
    
    System.out.println(n - 1 - m);
  }
}