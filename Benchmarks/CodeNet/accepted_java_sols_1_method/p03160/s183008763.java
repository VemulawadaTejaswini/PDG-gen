import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int h[] = new int[N+1];
    int d[] = new int[N+1];
    h[0]=0;
    for(int i=1;i<N+1;i++){
      h[i]=sc.nextInt();
    }
    d[0]=0;
    d[1]=0;
    d[2]=Math.abs(h[2]-h[1]);
    
    for(int i=3;i<N+1;i++){
      d[i]=Math.min(d[i-1]+Math.abs(h[i]-h[i-1]),d[i-2]+Math.abs(h[i]-h[i-2]));
    }
    
    System.out.println(d[N]);
    
    
  }
  

  
}