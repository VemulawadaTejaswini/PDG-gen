import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long k = Long.parseLong(sc.next());
    int p[] = new int[n+1];
    long c[] = new long[n+1];
    for(int i=1; i<=n; i++){
      p[i] = Integer.parseInt(sc.next());
    }
    for(int i=1; i<=n; i++){
      c[i] = Long.parseLong(sc.next());
    }
    long ans = -2* (long)Math.pow(10,9);
    int now = 0;
    
    for(int i=1; i<=n; i++){
      now = i;
      long tmp = 0;
      for(int j =0; j<k; j++){
        tmp = tmp + c[p[now]];
        now = p[now];
        ans = Math.max(ans,tmp);
      }
    }

    System.out.println(ans);
   
    sc.close();
    return;
  }
  
}
