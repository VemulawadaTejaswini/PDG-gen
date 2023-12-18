import java.util.* ;
public class Main{
       public static void main( String args[] ){
             Scanner cin = new Scanner( System.in ) ;
             int a = cin.nextInt() ;
             int b = cin.nextInt() ;
             if ( a % 2 == 1 && b % 2 == 1 ) System.out.println( "Yes" ) ;
             else System.out.println( "No" ) ;
       }
} 