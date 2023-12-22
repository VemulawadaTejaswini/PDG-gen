import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    long h[] = new long[n];
    long ans = 0;
    
    for(int i = 0; i < n; i++){
      h[i] = sc.nextInt();
    }

    Arrays.sort(h);

    if(n < k){
      ans = 0;
    } else {
      for(int i = 0; i < k; i++){
        h[n - i - 1] = 0;
      }
      for(int i = 0; i < n; i++){
        ans += h[i];
      }
    }

    System.out.println(ans);
  }
}
