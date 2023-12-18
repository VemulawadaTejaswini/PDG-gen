import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());

      int ans = 0;

      if(x<4){
        ans += (4-x)*100000;
      }
      if(y<4){
        ans += (4-y)*100000;
      }

      if(x==1&&y==1){
        ans += 400000;
      }

      System.out.println(ans);

    }
}
