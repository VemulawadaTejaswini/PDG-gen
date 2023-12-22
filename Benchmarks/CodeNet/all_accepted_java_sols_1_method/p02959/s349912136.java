import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int [n+1];
    for(int i=0;i<=n;i++)
      a[i]=sc.nextInt();
    long ans=0;
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      long min=Math.min(x, a[i]);
      ans += min;
      x-=min;
      min=Math.min(x, a[i+1]);
      a[i+1] -= min;
      ans += min;
    }
    System.out.println(ans);
  }
}