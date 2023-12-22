import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int l = sc.nextInt();
    int ans = 0;

    if(l < 0 && n + l - 1 < 0){
      for(int i = l; i < n + l - 1; i++){
        ans += i;
      } 
    } else if(l > 0 && n + l - 1 > 0){
      for(int i = l + 1; i < n + l; i++){
        ans += i;
      }
    } else {
      for(int i = l; i < n + l; i++){
        ans += i;
      }
    }

    System.out.println(ans);
  }
}
