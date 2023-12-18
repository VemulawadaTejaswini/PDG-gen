import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vec = new Vector<Integer>();
    while(sc.hasNextInt()){
      vec.add( sc.nextInt() );
    }
    int M = 1000000;
    boolean [] e = new boolean[M];
    e[0] = e[1] = true;
    for ( int i = 2; i < Math.sqrt(M); i++ ){
      if ( e[i] == false ){
        for ( int f = i*2; f < M; f += i ){
          e[f] = true;
        }
      }
    }
      
    for ( Integer x: vec ){
      int cnt = 0;
      for ( int i=2; i <= x; i++ ){
        if ( e[i] == false ){
          cnt++;
        }
      }
      System.out.println( cnt );
    }
  }
}