import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] c = new int[n];
    int count = 0;
    for (int i =0;i<n-1;i++){
      if ("AC".equals(s.substring(i,i+2))){
        count++;
      }
      c[i+1] = count;
    }
    for (int i = 0;i<q;i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      int ans = c[r-1]-c[l-1];
      System.out.println(ans);
    }
    sc.close();
  }
}