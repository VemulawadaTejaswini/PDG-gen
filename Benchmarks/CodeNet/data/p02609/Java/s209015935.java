import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String x = scan.next();
    char[] a = new char[n];
    for (int i=0;i<n;i++){
      a[i] = x.charAt(i);
    }

    long k = concate(a);
    for (int j=0;j<n;j++){
      long gg = (long) Math.pow(2,n-1-j);
      if (a[j] == '1'){
        k -= gg;
        System.out.println(find(k));
        k += gg;
      }
      else{
        k += gg;
        System.out.println(find(k));
        k -= gg;
      }
    }
  }

  static int coco(long n){
    int sum = 0;
    while (n > 0){
      int t = (int) n%2;
      if (t == 1){
        sum += 1;
      }
      n -= t;
      n = (int) n/2;
    }
    return sum;
  }

  static int find(long n){
    int sum = 0;
    while (n > 0){
      int g = coco(n);
      int a = (int) n%g;
      n = a;
      sum++;
    }
    return sum;
  }

  static long concate(char[] g){
    long sum = 0;
    int n = g.length;
    for (int i=0;i<n;i++){
      long p = (long) Math.pow(2,n-1-i);
      if (g[i] == '1'){
        sum += p;
      }
    }
    return sum;
  }
}
