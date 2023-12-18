import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());

      int ans = 0;

      if(2*b>=a){
        ans = 0;
      }
      else{
        ans = a - 2*b;
      }

      System.out.println(ans);

    }
}