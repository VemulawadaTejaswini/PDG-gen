import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    int b = sc.nextInt();
    
    int ans = 0;
    
    if (b > 1 && b <= a){
      ans = 1;
    } else if (b > a){
      ans = (b - a)/(a-1) + 1;
      if ((b-a)%(a-1) != 0){
        ans++;
      }
    }
    
    System.out.print(ans);
    
  }
}