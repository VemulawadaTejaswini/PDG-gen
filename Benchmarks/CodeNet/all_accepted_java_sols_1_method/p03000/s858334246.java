import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long x = sc.nextInt();
    int d = 0;
    int ans = 1;

    for(int i = 0; i < n; i++){
      int l = sc.nextInt();
      if(d + l <= x){
        d += l;
        ans += 1;
      } else {
        break;
      }
    }

    System.out.println(ans);
  }
}
