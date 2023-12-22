import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int count = 0;
    if(n < 105){
      System.out.println(0);
      return;
    }
    for(int i = 105;i<=n;i++){
      if(i % 2 == 0){
        continue;
      }
      count = 0;
      for(int j = 1;j<=i;j++){
        if(i % j == 0){
          count++;
        }
      }
      if(count == 8){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
