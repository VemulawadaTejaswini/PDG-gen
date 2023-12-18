import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int ans = 0;
    
    while(i*i <= n) {
      ans = i*i;
      i++;
    }
        
    System.out.println(ans);
  }
}
