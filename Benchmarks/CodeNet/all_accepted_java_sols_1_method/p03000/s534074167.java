import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int x=sc.nextInt();

      int[] l = new int[n];
      int[] d = new int[n+1];
      int cnt=1;

      for(int i=0;i<n;i++){
        l[i]=sc.nextInt();
      }

      d[0]=0;

      for(int i=1;i<=n;i++){
        d[i]=d[i-1]+l[i-1];
        if(d[i]<=x){
          cnt++;
        }
        else{
          break;
        }
      }

      System.out.println(cnt);


    }
}
