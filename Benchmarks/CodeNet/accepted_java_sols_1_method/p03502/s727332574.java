import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] c = {0,0,0,0,0,0,0,0,0};

    c[ 8 ] =                   N / 100_000_000 ;
    c[ 7 ] = ( N % 100_000_000 ) / 10_000_000  ;
    c[ 6 ] = ( N % 100_000_00 )  / 10_000_00   ;
    c[ 5 ] = ( N % 100_000_0 )   / 10_000_0    ;
    c[ 4 ] = ( N % 100_000 )     / 10_000      ;
    c[ 3 ] = ( N % 10_000 )      / 1_000       ;
    c[ 2 ] = ( N % 1_000 )       / 100         ;
    c[ 1 ] = ( N % 100 )         / 10          ;
    c[ 0 ] =   N % 10                          ;

    int digitSum = c[0] + c[1] + c[2] + c[3] +
                   c[4] + c[5] + c[6] + c[7] + c[8]  ;

    System.out.println( N % digitSum == 0 ? "Yes" : "No" );
  }
}
