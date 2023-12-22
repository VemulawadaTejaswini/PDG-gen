import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;

    for(int i = 1; i <= n; i++){
      String s = String.valueOf(i);
      if(s.length() % 2 == 1){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
