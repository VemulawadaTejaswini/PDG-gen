import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;

    for(int i = 1; i <= n; i += 2){
      int buf = 0;
      for(int j = 1; j <= n; j++){
        if(i % j == 0){
          buf += 1;
        }
      }
      if(buf == 8){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
