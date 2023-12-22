import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());

      int ans = 0;

      for(int i=a;i<=t+0.5;i+=a){
        ans += b;
      }

      System.out.println(ans);

    }
}
