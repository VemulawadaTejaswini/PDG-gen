import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] az = new int[n];
    int[] bz = new int[n];
    for(int i = 0; i < n; i++) {
      int p = sc.nextInt() - 1;
      az[p] += i;
      bz[0] += i;
      if(p < n - 1) bz[p + 1] -= i;
    }
    for(int i = 1; i < n; i++) {
      az[i] += az[i - 1];
      bz[i] += bz[i - 1]; 
    }
    for(int i = 0; i < n; i++) {
      System.out.print((i + 1) + az[i]);
      if(i < n - 1) System.out.print(" ");
    }
    System.out.println();
    for(int i = 0; i < n; i++) {
      System.out.print((n - i) + bz[i]);
      if(i < n - 1) System.out.print(" ");
    }
    System.out.println();
  }
}