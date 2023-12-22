import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] x = new int[m];
    if(n >= m) {
      System.out.println(0);
      System.exit(0);
    }
    for(int i=0; i<m; i++) {
      x[i] = sc.nextInt();
    }
    Arrays.sort(x);
    int[] span = new int[m-1];
    for(int i=0; i<m-1; i++) {
      span[i] = x[i+1] - x[i];
    }
    Arrays.sort(span);
    for(int i=0; i<m-n; i++) {
      ans += span[i];
    }
    System.out.println(ans);
  }
}