import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vec = new Vector<Integer>();
    while(sc.hasNextInt()){
      vec.add( sc.nextInt() );
    }
    for ( Integer x: vec ){
      int cnt = 0;
      for ( int i=2; i <= x; i++ ){
       if ( isPrime(i) ){
        cnt++;
       }
      }
      System.out.println( cnt );
    }
  }
  static boolean isPrime( int x ){
    for ( int i = 2; i <= Math.sqrt(x); i++ ){
      if ( x % i == 0 ){
        return false;
      }
    }
    return true;
  }
}