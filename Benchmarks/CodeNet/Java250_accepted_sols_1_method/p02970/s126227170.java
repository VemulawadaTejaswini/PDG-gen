import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int d=sc.nextInt();

      int ans=0;
      int left=n;

      for(int i=0;i<n;i++){
        left = left - (1 + 2*d);
        ans++;
        if(left<=0){
          break;
        }
      }

      System.out.println(ans);

    }
}
