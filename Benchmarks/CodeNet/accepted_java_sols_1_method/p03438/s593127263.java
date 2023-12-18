import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int[] b = new int[n];
      for(int i = 0; i < n; i++)
        b[i] = sc.nextInt();

      long smallCnt = 0;
      long greaterCnt = 0;
      for(int i = 0; i < n; i++) {
        if(a[i] == b[i]) continue;
        if(a[i] < b[i])
          greaterCnt += (b[i] - a[i]) / 2;
        else
          smallCnt += a[i] - b[i];
      }
      System.out.println(greaterCnt >= smallCnt ? "Yes" : "No");
  }
}