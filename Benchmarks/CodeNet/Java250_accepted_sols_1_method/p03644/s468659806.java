import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      double a = sc.nextInt();
      double ans = 0;
      for(double i = 6; i > 0;i--){
        if(a >= Math.pow(2,i)){
          ans = Math.pow(2,i);
          break;
        }
      }
      if(a == 1){
        ans = 1;
      }
      System.out.println(Math.round(ans));
    }
}
