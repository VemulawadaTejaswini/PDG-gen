import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    
    for(int i = 1; i*i <= n; ++i){
      int num = (int)Math.pow(i,2);
      if(num <= n){
        ans = (int)num;
      }else{
        break;
      }
      
    }
    
    System.out.print(ans);
    
  }
}