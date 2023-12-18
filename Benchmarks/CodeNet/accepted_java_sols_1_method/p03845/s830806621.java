import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      t[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    
    for(int i = 0 ; i < m ; ++i){
      int x[] = new int[n];
      for(int j = 0 ; j < n ; ++j){
        x[j] = t[j];
      }
      int p = sc.nextInt();
      x[p-1] = sc.nextInt();
      int ans = 0;
      for(int j = 0 ; j < n ; ++j){
        ans += x[j];
      }
      System.out.println(ans);
    }
    
    
  }
}
