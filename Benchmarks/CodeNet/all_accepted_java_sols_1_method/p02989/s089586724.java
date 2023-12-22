import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] g = new int[n];
    for (int i=0;i<n;i++){
      g[i] = scan.nextInt();
    }
    Arrays.sort(g);
    if (g.length % 2 != 0){
      System.out.println(0);
    }
    else{
      int t = g.length;
      t = (int) t/2;
      System.out.println(g[t] - g[t-1]);
    }
  }
}
