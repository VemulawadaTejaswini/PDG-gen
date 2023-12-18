import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[n];
    long kabu = 0;
    long money = 1000;
   
    for (int i=0; i<n; i++) {
      a[i] = sc.nextInt();
    }
    
    for (int i=1; i<n; i++) {
      if(a[i]>a[i-1]) {
        kabu = money / a[i-1];
        money = money % a[i-1];
        money += kabu*a[i];
        kabu = 0;
      }
    }
    
    System.out.println(money);
  }
}