import java.util.*;

class Main {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int total = 0;
    int res[] = new int[n];
    for(int i =0; i < n; i++) {
      a[i] = sc.nextInt();
      total ^= a[i];
    }
    
    for(int i = 0; i < n; i++) {
      res[i] = a[i]^total;
      System.out.print(res[i]+" ");
    }
    
  }
}
