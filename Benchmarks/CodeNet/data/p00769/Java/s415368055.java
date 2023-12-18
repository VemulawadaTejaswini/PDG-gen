import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Dance {
    boolean u;
    boolean r;
    boolean d;
    boolean l;

    Dance() {
      u = r = d = l = true;
    }

    void wall() {
      u = r = d = l = false;
    }

    boolean adj(int n) {
      switch ( n ) {
      case 0:
        return u;
      case 1:
        return r;
      case 2:
        return d;
      case 3:
        return l;
      }
      return false;
    }

    int[][] ofs = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };

    int[] trans(int n) {
      return ofs[ n ];
    }
  }

  class Node {
    int num;
    ArrayList<Node> children;

    Node() {
      num = 0;
      children = new ArrayList<Node>();
    }

    int get(int depth) {
      if ( children.size() == 1 ) {
        return children.get( 0 ).num;
      }
      // debug( "get", num, children.size() );
      ArrayList<Integer> list = new ArrayList<Integer>();
      for ( Node c : children ) {
        list.add( c.get( depth - 1 ) );
      }
      Collections.sort( list );
      for ( int i = 0; i < ( list.size() + 1 ) / 2; ++i ) {
        if ( depth == 2 ) {
          num += ( list.get( i ) + 1 ) / 2;
        } else {
          num += list.get( i );
        }

        // debug( "+", ( list.get( i ) + 1 ) / 2 );
      }
      // debug( num );
      return num;
    }

    int length(int depth) {
      if ( children.size() == 0 ) {
        return depth;
      } else {
        return children.get( 0 ).length( depth + 1 );
      }
    }
  }

  boolean isNum(char c) {
    return '0' <= c && c <= '9';
  }

  class Pair<T, U> {
    T f;
    U s;

    Pair(T a, U b) {
      f = a;
      s = b;
    }
  }

  Pair<Node, Integer> make(char[] str, int idx, int n, int depth) {
    Node node = new Node();

    char c = str[ idx ];
    // debug( depth, "::", idx, "/", n, ":", c );
    if ( isNum( c ) ) {
      ArrayList<Character> list = new ArrayList<Character>();
      while (isNum( str[ idx ] )) {
        list.add( str[ idx ] );
        ++idx;
      }
      char[] dl = new char[list.size()];
      for ( int i = 0; i < list.size(); ++i ) {
        dl[ i ] = list.get( i );
      }
      node.num = Integer.parseInt( new String( dl ) );
    } else {
      // [
      ++idx;
      LinkedList<Node> list = new LinkedList<Node>();
      // ]?????§??????
      while (str[ idx ] != ']') {
        Pair<Node, Integer> pair = make( str, idx, n, depth + 1 );
        list.add( pair.f );
        idx = pair.s;
        // debug( "res", idx, str[ idx ], str[ idx ] != ']' );
      }
      node.children.addAll( list );

      ++idx;
    }

    return new Pair<Node, Integer>( node, idx );
  }

  void run() {
    int n = ni();
    for ( int i = 0; i < n; ++i ) {
      String str = sc.next();
      Pair<Node, Integer> root = make( str.toCharArray(), 0, str.length(), 0 );
      int depth = root.f.length( 0 );
//      debug( depth );

      System.out.println( root.f.get( depth ) );
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