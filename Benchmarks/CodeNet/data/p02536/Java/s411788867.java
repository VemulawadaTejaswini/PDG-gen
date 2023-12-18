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
    int r = n-1-m < 0 ? 0:n-1-m;
    System.out.println(r);
  }
}