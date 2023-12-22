import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int half=n/2;
      int cnt=0;

      int[] d = new int[n];

      for(int i=0;i<n;i++){
        d[i] = sc.nextInt();
      }

      Arrays.sort(d);

      for(int i=d[half-1]+1;i<=d[half];i++){
        cnt++;
      }


      System.out.println(cnt);

    }
}
