import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int sum = 0;

    int[] a = new int[ N ] ;
    for(int i = 0 ; i < N ; i ++ ){
      a[i] = sc.nextInt();
      sum = sum + a[i];
    }
    //切上
    int average = (int) Math.round( (double) sum  / N   ) ;

    int cost = 0 ;
    for( int i = 0 ; i < N ; i ++ ){
      cost = cost + ( a[i] - average ) * ( a[i] - average ) ;
    }

    System.out.println( cost );
  }
}
