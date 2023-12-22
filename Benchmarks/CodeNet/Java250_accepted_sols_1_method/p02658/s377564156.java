import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long max = 1000000000000000000l;
    long now = 1l;
    long[] a = new long[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextLong();
      if(a[i] == 0){
        System.out.println(0);
        return;
      }
    }
    for(int i = 0;i<n;i++){
      max /= a[i];
      // if(max % long != 0)koe = true;
      if(max == 0){
        System.out.println(-1);
        return;
      }
      now *= a[i];
    }
    System.out.println(now);
  }
}
