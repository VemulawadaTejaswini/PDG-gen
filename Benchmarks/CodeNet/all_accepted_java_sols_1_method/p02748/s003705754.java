
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int a[] = new int[A];
    int b[] = new int[B];
    int x[] = new int[M];
    int y[] = new int[M];
    int c[] = new int[M];
    for(int i=0;i<A;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<B;i++){
      b[i]=sc.nextInt();
    }
    int ans=1000000;
    for(int i=0;i<M;i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    for(int i=0;i<M;i++){
      if(ans>a[x[i]-1]+b[y[i]-1]-c[i]){
        ans=a[x[i]-1]+b[y[i]-1]-c[i];
      }
    }
    Arrays.sort(a);
    Arrays.sort(b);
    if(ans>a[0]+b[0]){
      ans=a[0]+b[0];
    }
    System.out.println(ans);

  }
  

  
}
