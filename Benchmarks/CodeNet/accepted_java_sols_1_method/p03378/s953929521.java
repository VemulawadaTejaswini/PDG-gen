import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    
    boolean[] f = new boolean[N+1];    
    for(int i = 0; i < M; i++){
      int n = Integer.parseInt(sc.next());
      f[n] = true;
    }
    
    int l = 0, u = 0;
    for(int i = 0; i < N; i++){
      if(f[i]){
        if(i < X){
          l++;
        }else{
          u++;
        }
      }
    }
    System.out.println(Math.min(l,u));
  }
}