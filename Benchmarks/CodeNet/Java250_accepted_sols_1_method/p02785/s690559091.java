import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    long h[] = new long[n];
    long count = 0;
    long sum = 0;

    for (int i = 0;i<n ;i++ ) {
      h[i] = sc.nextInt();
    }

    Arrays.sort(h);

    if (n<=k) {
      System.out.println(0);
      System.exit(0);
    }

    for (int i = 0;i<k;i++) {
      h[n-i-1]=0;
    }
    for (int i = 0;i<n ;i++ ) {
      sum += h[i];
    }

    System.out.println(sum);
  }
}
