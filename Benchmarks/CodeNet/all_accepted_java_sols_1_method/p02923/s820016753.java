import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int ans = 0;

      int[] h = new int[n];

      for(int i=0;i<n;i++){
        h[i] = sc.nextInt();
      }

      int check=0;

      for(int i=0;i<n-1;i++){
        if(h[i]>=h[i+1]){
          check++;
        }
        if(h[i]<h[i+1]){
          ans = Math.max(ans,check);
          check = 0;
        }
      }
      /*
      if(h[n-2]>=h[n-1]){
        check++;
      }
      */

      ans = Math.max(ans,check);


      System.out.println(ans);

    }
}
