import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];

    for (int i=0; i<n; i++){
      a[i] = scanner.nextInt();
    }
    for (int i=0; i<m; i++){
      b[i] = scanner.nextInt();
    }

    int ans = 0;
    int t = k;
    int a_i = 0;
    int b_i = 0;
    while(t>0){
      if(a_i < n && b_i < m){
        if(a[a_i] > b[b_i]){
          t -= b[b_i];
          b_i++;
          if(t >= 0){
            ans++;
          }
        }else{
          t -= a[a_i];
          a_i++;
          if(t >= 0){
            ans++;
          }
        }
      }else if(a_i==n){
        t -= b[b_i];
        b_i++;
        if(t >= 0){
          ans++;
        }
      }else if(b_i == m){
        t -= a[b_i];
        a_i++;
        if(t >= 0){
          ans++;
        }
      }else{
        t = -1;
      }
    }
    System.out.println(ans);
    
    scanner.close();
    return;
  }
}
