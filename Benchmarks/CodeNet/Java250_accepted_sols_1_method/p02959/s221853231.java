import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long [] a = new long[n+1];
    long [] b = new long[n];
    long [] d = new long[n];
    for (int i=0;i<n+1;i++){
      a[i] = scan.nextLong();
    }
    for (int j=0;j<n;j++){
      b[j] = scan.nextLong();
    }
    long sum = 0;
    for (int k=0;k<n-1;k++){
      if (a[k] > d[k]){
        sum += d[k];
        a[k] -= d[k];
      }
      else{
        sum += a[k];
        d[k+1] = b[k];
        continue;
      }

      long c = b[k] - a[k];
      if (c >= 0){
        sum += a[k];
        d[k+1] += c;
      }
      else{
        sum += b[k];
      }
    }

    if (d[n-1] >= a[n-1]){
      sum += a[n-1];
      a[n-1] = 0;
    }
    else{
      sum += d[n-1];
      a[n-1] -= d[n-1];
    }
    
    if (b[n-1] > a[n-1] + a[n]){
      b[n-1] = a[n-1] + a[n];
    }
    sum += b[n-1];
    System.out.println(sum);

  }
}
