import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h[] = new int[n];
    
    for(int i = 0 ; i < n ; ++i){
      h[i] = sc.nextInt();
    }
    
    int count = 0;
    int ans = 0;
    
    for(int i = 1 ; i < n ; ++i){
      if(h[i-1]>=h[i]){
        count++;
      }else{
        count = 0;
      }
      
      ans = Math.max(ans,count);

    }
    
    System.out.println(ans);
    
  }
}