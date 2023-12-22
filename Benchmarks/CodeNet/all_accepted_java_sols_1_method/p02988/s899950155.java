import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int ans = 0;
    
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    
    for(int i=0;i<N-2;i++){
      if(a[i]>a[i+1] && a[i+1]>a[i+2]){
        ans++;
      }else if(a[i]<a[i+1] && a[i+1]<a[i+2]){
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}