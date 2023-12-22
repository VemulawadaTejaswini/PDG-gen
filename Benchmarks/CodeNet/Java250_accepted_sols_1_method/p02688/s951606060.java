import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    boolean [] g = new boolean[n];
    for (int gg = 0;gg<n;gg++){
      g[gg] = true;
    }
    for (int i=0; i<k; i++){
      int a = scan.nextInt();
      for (int j=0;j<a;j++){
        int d = scan.nextInt();
        g[d-1] = false;
      }
    }
    int sum = 0;
    for (int q=0; q<n; q++){
      if (g[q] == true){
        sum += 1;
      }
    }
    System.out.println(sum);
  }
}
