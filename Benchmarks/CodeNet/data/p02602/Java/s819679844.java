import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    
    int before = 1;
    for(int i = 0; i < k; i++)
      before *= a[i];
    
    for(int i = 1; i <= n-k; i++){
      int now = 0;
      
      now = before / a[i-1];
      now *= a[i+k-1];
      
      if(before < now)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      before = now;
    }
  }
}
