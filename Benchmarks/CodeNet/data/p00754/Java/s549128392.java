import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      char[] str = sc.nextLine().toCharArray();

      if ( str.length == 1 && str[ 0 ] == '.' ) {
        break;
      }

      LinkedList<Character> list = new LinkedList<Character>();
      HashMap<Character, Character> map = new HashMap<Character, Character>();
      map.put( '(', ')' );
      map.put( '[', ']' );
      list.add( ' ' );
      boolean f = true;
      for ( int i = 0; i < str.length; ++i ) {
        if ( !f ) {
          // debug(i);
          break;
        }
        switch ( str[ i ] ) {
        case '[':
        case '(':
          list.add( str[ i ] );
          break;
        case ']':
        case ')':
          char c = list.pollLast();
          if ( map.containsKey( c ) ) {
            // debug(c);
            f &= map.get( c ) == str[ i ];
          } else {
            f = false;
          }
          break;
        }
      }

      f &= list.size() == 1;

      System.out.println( f ? "yes" : "no" );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}