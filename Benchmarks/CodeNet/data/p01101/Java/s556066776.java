import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    while(true){
      int n = s.nextInt();
      int m = s.nextInt();

      if(n==0 && m==0){
        break;
      }

      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i] = s.nextInt();
      }

      int ans = 0;
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if(i==j){
            continue;
          }
          int l = a[i] + a[j];
          if(ans < l && l <= m){
            ans = l;
          }
        }
      }

      if(ans==0){
        System.out.println("NONE");
      }else{
        System.out.println(ans);
      }
    }
    
  }
}
