import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int L = 1;
    int R = N;
    
    for(int i=0; i<M; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      L = Math.max(L,a);
      R = Math.min(R,b);
    }
    
    if(R-L+1>0){
      System.out.println(R-L+1);
    } else {
      System.out.println(0);
    }
  }
}
    
    