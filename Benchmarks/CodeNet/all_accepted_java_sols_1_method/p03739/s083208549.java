import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] a = new long[n+1];
    long[] b = new long[n+1];
    long ans1 =0, ans2 =0,total =0;
    
    //a[1]を+とするケース
    for (int i =1; i<=n; i++) {
      a[i] = Long.parseLong(sc.next());
      b[i] = a[i];
      total += a[i];
      if (i % 2 == 1 && total <=0) {
        long p = 1 - total;
        ans1 += p; 
        total -= a[i]; 
        a[i] += p; 
        total += a[i]; 
      }
      if (i % 2 == 0 && total >=0) {
        long p = 1 + total;
        ans1 += p; 
        total -= a[i]; 
        a[i] -= p; 
        total += a[i]; 
      }
    }
    
    total =0;
    
     //a[1]を-とするケース
    for (int i =1; i<=n; i++) {
      total += b[i];
      if (i % 2 == 0 && total <=0) {
        long p = 1 - total;
        ans2 += p;
        total -= b[i];
        b[i] += p;
        total += b[i];
      }
      if (i % 2 == 1 && total >=0) {
        long p = 1 + total;
        ans2 += p;
        total -= b[i];
        b[i] -= p;
        total += b[i];
      }
      
    }   
    System.out.print(Math.min(ans1,ans2));
  }
}