import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int m = sc.nextInt();
      int d = sc.nextInt();

      int d1;
      int d10;

      int ans = 0;

    if(d>=22 && m>=4){

      for(int i=4;i<=m;i++){
        for(int j=22;j<=d;j++){
          d1 = j%10;
          d10 = (j-d1)/10;
          if(d1>=2 && d10>=2 && d1*d10==i){
            ans++;
          }
        }
      }

    }

      System.out.println(ans);

    }
}
