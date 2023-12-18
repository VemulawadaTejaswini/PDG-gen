import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    long sum = 0, ans = 0;
    int a;
    for(int i = 0; i < n; i++){
      a = sc.nextInt();
      ans += sum * a;
      sum += a;
    }
    
    //System.out.println(sum);
    //System.out.println(ans);
    ans = ans % 1000000007;
    System.out.println(ans);
  }
}
