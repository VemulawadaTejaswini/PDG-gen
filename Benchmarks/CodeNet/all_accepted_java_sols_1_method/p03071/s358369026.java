import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());

      int ans = 0;

for(int i=1;i<=2;i++){
      if(a>=b){
       ans += a;
       a = a-1;
      }
      else{
       ans += b;
       b = b-1;
     }
}


      System.out.println(ans);

    }
}
