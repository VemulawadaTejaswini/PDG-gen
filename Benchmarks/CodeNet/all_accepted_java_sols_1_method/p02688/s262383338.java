import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    boolean[] cnt = new boolean[n];
    int ans = 0;

    for(int i = 0; i < k; i++){
      int d = sc.nextInt();
      
      for(int j = 0; j < d; j++){
        int a = sc.nextInt();
        cnt[a - 1] = true;
      }
    }

    for(int i = 0; i < n; i++){
      if(cnt[i] == false){
        ans+= 1;
      }
    }

    System.out.println(ans);
  }
}
