import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      sum += a[i];
    }

    Arrays.sort(a);

    System.out.println(a[0] + " " + a[n - 1] + " " + sum);
  }
}

