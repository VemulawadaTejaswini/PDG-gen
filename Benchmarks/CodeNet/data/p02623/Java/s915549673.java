import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    long k = scan.nextLong();

    long[] a = new long[n];
    long[] b = new long[m];
    long[] c = new long[n+1];
    long[] d = new long[m+1];

    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }

    for (int i=0;i<m;i++){
      b[i] = scan.nextLong();
    }

    for (int i=0;i<n;i++){
      c[i+1] = c[i]+a[n-1-i];
    }

    for (int i=0;i<m;i++){
      d[i+1] = d[i]+b[m-1-i];
    }

    int sum = 0;

    for (int i=0;i<=n;i++){
      int a1 = i;
      long a2 = c[i];
      if (c[i] > k){
        break;
      }
      long b2 = k-c[i];
      int b1 = search(d,b2);
      if (a1+b1>sum){
        sum = a1+b1;
      }
    }

    System.out.println(sum);
  }

  static int search(long[] a, long b){
    int ret = 0;

    int start = 0;
    int end = a.length-1;

    while (start < end){
      int mid = (int) (start+end+1)/2;

      if (a[mid] == b){
        return mid;
      }

      if (a[mid] < b){
        start = mid;
      }
      else{
        end = mid-1;
      }
    }
    return start;
  }
}
