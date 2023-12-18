import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int Tsum = 0 ;
    int[] T = new int[ N ];
    for(int i = 0 ; i < N ; i ++){
      T[i] = sc.nextInt();
      Tsum = Tsum + T[i] ;
    }

    int M = sc.nextInt();
    int[] result = new int[ M ];
    for(int i = 0 ; i < M ; i ++){
      int P = sc.nextInt();
      int X = sc.nextInt();

      result[ i ] = Tsum - T[ P - 1 ] + X ;
    }
    
    for(int i = 0 ; i < M ; i ++){
      System.out.println(result[i]);
    }
  }
}
