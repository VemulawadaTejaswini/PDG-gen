import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int a = ni();
      int l = ni();

      if ( ( a | l ) == 0 ) {
        break;
      }

      String as = Integer.toString( a );
      HashMap<String, Integer> map = new HashMap<String, Integer>();

      int idx = 0;
      for ( ; !map.containsKey( as ); ++idx ) {
        map.put( as, idx );

        int len = as.length();
        for ( int i = len; i < l; ++i ) {
          as += "0";
        }

        ArrayList<Character> min = new ArrayList<Character>();
        for ( char c : as.toCharArray() ) {
          min.add( c );
        }
        ArrayList<Character> max = new ArrayList<Character>( min );
        Collections.sort( min );
        Collections.sort( max, Collections.reverseOrder() );

        String mins = "";
        for ( Character c : min ) {
          mins += c;
        }
        String maxs = "";
        for ( Character c : max ) {
          maxs += c;
        }

        // debug(idx, maxs, mins);

        as = Integer.toString( Integer.parseInt( maxs )
            - Integer.parseInt( mins ) );
      }

      System.out.println( map.get( as ) + " " + as + " "
          + ( idx - map.get( as ) ) );
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