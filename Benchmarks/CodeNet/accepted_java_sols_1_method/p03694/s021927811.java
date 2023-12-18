import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[ N ] ;
    int minA = 1000 ;
    int maxA = 0    ;

    for(int i = 0 ; i <  N ;i ++){
      a[ i ] = sc.nextInt();
      if(a[ i ] < minA){
        minA = a[ i ];
      }
      if(a[ i ] > maxA){
        maxA = a[ i ];
      }
    }
    System.out.println( maxA - minA );

  }
}
