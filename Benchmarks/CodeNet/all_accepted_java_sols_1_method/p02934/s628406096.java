import java.util.*;
import java.math.BigDecimal;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ary[] = new double[n];
    double ans = 0;
    
    for (int i = 0; i < n; i++) { 
      ary[i] = sc.nextDouble(); 
      ans += 1 / ary[i];
    }
    
    ans = 1 / ans;
    
    System.out.println(ans);
  }
}

