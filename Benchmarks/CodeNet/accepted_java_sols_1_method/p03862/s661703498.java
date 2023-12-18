import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[N];
    long sum = 0;
    for(int i = 0; i < N; i++){
      a[i] = sc.nextLong();
    }
    if(a[0] > x){
      sum = a[0] - x;
      a[0] = x;
    }
    for(int i = 1; i < N; i++){
      if(a[i]+a[i-1] > x){
        long tmp = a[i] + a[i-1] - x;
        a[i] = a[i] - tmp;
        sum += tmp;
      }
    }
    System.out.println(sum);
  }
}