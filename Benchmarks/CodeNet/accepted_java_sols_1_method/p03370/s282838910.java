import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int X = sc.nextInt();

      int min_m = 1000;
      int sum_m = 0;
      int [] m = new int[ N ];
      for(int i = 0 ; i < N ; i ++){
        m[ i ] = sc.nextInt();
        sum_m += m[ i ];
        if(m[ i ] < min_m){
          min_m = m[ i ];
        }
      }

      System.out.println( N + (X - sum_m) / min_m );
  }

}
