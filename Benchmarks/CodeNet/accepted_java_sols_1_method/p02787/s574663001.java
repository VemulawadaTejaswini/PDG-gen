import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int[] a = new int[y];
    int[] b = new int[y];

    for (int i=0;i<y;i++){
        a[i] = scan.nextInt();
        b[i] = scan.nextInt();
    }

    long[] c = new long[20000];
    Arrays.fill(c,1000000000);
    c[0] = 0;
    for (int i=0;i<y;i++){
      for (int j=0;j<x;j++){
        c[j+a[i]] = (long) Math.min(c[j+a[i]],c[j] + b[i]);
      }
    }

    long min = 1000000000;
    for (int t = 19999;t>=x;t--){
      min = (long) Math.min(min,c[t]);
    }
    System.out.println(min);
  }

}
