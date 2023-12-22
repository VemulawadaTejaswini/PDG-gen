import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int t = Integer.parseInt(sc.next());
    
    int ans = n / x;
    if(n%x > 0){
      ans++;
    }
    ans = ans * t;

    System.out.println(ans);
   
    sc.close();
    return;
  }
  
  
}
