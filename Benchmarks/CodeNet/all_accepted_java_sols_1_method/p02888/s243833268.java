import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] L = new int[n];
    for(int i=0;i<n;i++)L[i]=sc.nextInt();
    Arrays.sort(L);
    int l = 0;
    int r = 1;
    int ans = 0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        l=j;
        r=n;
        while(r-l>1){
          int m = (l+r)/2;
          if(L[m]<L[i]+L[j])l=m;
          else r=m;
        }
        ans+=l-j;
      }
    }
    System.out.println(ans);
  }
}