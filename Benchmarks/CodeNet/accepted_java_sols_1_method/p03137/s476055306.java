import java.util.*;
 
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] x = new int[m];
      for (int i = 0; i < m; i++) {
        x[i] = sc.nextInt(); 
      }
      Arrays.sort(x);
      int[] sum = new int[m-1];
      for (int i = 0; i < m - 1; i++) {
        sum[i] = x[i+1]-x[i];
      }
      Arrays.sort(sum);
      int ans = 0;
      for (int i = 0; i < m - n; i++) {
          ans += sum[i];
      }
    System.out.println(ans);
    }
  }