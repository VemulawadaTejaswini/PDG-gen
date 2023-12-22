import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt();
    int[] p = new int[n];
    int count =0;
    for (int i =0; i<n; i++) {
      p[i] = sc.nextInt();
    }
    for (int i=1; i<n-1; i++) {
      if(p[i] > Math.min(p[i-1],p[i+1]) && p[i] <= Math.max(p[i-1],p[i+1])) {
        count++;
      }
    }  
    System.out.println(count);
  }
}