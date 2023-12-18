import java.util.Scanner;

class Main {
    public static void main( String args[] ) {

      Scanner scan = new Scanner(System.in);


      int[] input = new int[10];
      int x;
      for( int i = 0; i < 10; i++ ) {
        input[i] = scan.nextInt();
      }

      for( int i = 0; i < 10; i++ ) {
        for( int r = i+1; r < 10; r++ ) {
          if( input[i] < input[r] ) {
            x = input[i];
            input[i] = input[r];
            input[r] = x;
          }
        }
      }

      System.out.println( input[0] );
      System.out.println( input[1] );
      System.out.println( input[2] );

    }
}