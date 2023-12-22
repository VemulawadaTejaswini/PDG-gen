import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] h = new long[n];
    boolean[] tmp = new boolean[n];
    Arrays.fill(tmp, true);
    int ans = 0;

    for(int i = 0; i < n; i++){
      h[i] = sc.nextLong();
    }

    for(int i = 0; i < m; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      if(h[a - 1] > h[b - 1]){
        tmp[b - 1] = false;
      } else if(h[a - 1] < h[b - 1]){
        tmp[a - 1] = false;
      } else if(h[a - 1] == h[b - 1]){
        tmp[a - 1] = false;
        tmp[b - 1] = false;
      }
    }

    for(int i = 0; i < n; i++){
      if(tmp[i]){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
