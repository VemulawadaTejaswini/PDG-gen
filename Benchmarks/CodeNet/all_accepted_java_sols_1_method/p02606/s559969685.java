import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    int ans = 0;
    for (int i = n; i <= r; i++){
      if (i%d==0) ans++;
    }
    System.out.println(ans);
  }
}
