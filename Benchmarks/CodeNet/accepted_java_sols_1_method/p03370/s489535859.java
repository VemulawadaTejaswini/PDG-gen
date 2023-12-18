import java.util.*;

public class Main {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int m = sc.nextInt();
    int stack;
    int ans;
    
    x -= m;
    
    for(int i = 1; i < n;i++){
      stack = sc.nextInt();
      x -= stack;
      if(m > stack) m = stack;
    }
    
    ans = n + x/m;
    System.out.println(ans);
  }
}
