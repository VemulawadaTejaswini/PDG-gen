import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    if (n >= m){
      System.out.println(0);
      return;
    }

    long[] g = new long[m];
    for (int i=0;i<m;i++){
      g[i] = scan.nextLong();
    }
    Arrays.sort(g);

    long[] g1 = new long[m-1];
    for (int j=0;j<m-1;j++){
      g1[j] = g[j+1]-g[j];
    }

    Arrays.sort(g1);
    long sum = g[m-1]-g[0];

    for (int k=0;k<n-1;k++){
      sum -= g1[m-2-k];
    }

    System.out.println(sum);
  }
}
