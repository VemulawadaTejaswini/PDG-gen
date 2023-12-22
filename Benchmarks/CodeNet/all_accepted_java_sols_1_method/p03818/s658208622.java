import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0;i < n;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    int cnt = 1;
    int ans = 0;
    for(int i =1;i < n;i++)if(a[i]!=a[i-1])cnt++;
    if(cnt%2==1)ans=cnt;
    else ans=cnt-1;
    System.out.println(ans);
  }
}