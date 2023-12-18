import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      ArrayDeque<String> list = new ArrayDeque<>(q);

      String[] query;
      int op;
      int terms;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            terms = Integer.parseInt(query[1]);
            if ( terms == 0 )
              list.addFirst(query[2]);
            else
              list.addLast(query[2]);
            break;
          case 1 :
            System.out.println( list.toArray()[(Integer.parseInt(query[1]))] );
            break;
          case 2 :
            terms = Integer.parseInt(query[1]);
            if ( terms == 0 )
              list.removeFirst();
            else
              list.removeLast();
            break;
          default:
        }
      }
    }
  }
}
