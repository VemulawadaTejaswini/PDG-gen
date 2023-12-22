import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    long[] p = new long[n-1];

    for(int i=0; i<n; ++i)
      h[i] = sc.nextLong();

    for(int i=0; i<p.length; ++i) {
      if(h[i] < h[i+1]) p[i] = 0;
      else p[i] = 1;
    }

    int max1 = 0;
    int max2 = 0;
    for(int i=0; i<p.length; ++i) {
      if( p[i] == 1 ) {
        ++max1;
      }
      else {
        max2 = Math.max(max1, max2);
        max1 = 0;
      }
    }

    System.out.println(Math.max(max1, max2));
  }
}