import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    long[] a = new long[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }

    Arrays.sort(a);
    for (int i=0;i<n;i++){
      sum += a[i];
    }
    sum -= a[0];
    System.out.println(sum);
  }
}
