import java.util.Scanner;

class Main {
  public static void main( String args[] ) {
    Scanner scan = new Scanner( System.in );

    while( scan.hasNext() ) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      int z = 1;
      int out = 0;
      while( true ) {
        int r = ( x + y ) / z;
        if( r == 0 ) {
          break;
        } else {
          z *= 10;
          out++;
        }
      }
      System.out.println(out);
    }
  }
}