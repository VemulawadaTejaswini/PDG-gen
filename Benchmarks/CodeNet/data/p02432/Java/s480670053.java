import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      List<String> list = new LinkedList<>();

      String[] query;
      int op;
      int num;
      int terms;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            terms = Integer.parseInt(query[1]);
            if ( terms == 1 )
              list.add(query[2]);
            else
              list.add(0,query[2]);
            break;
          case 1 :
            System.out.println( list.get(Integer.parseInt(query[1])) );
            break;
          case 2 :
            terms = Integer.parseInt(query[1]);
            if ( terms == 1 )
              list.remove(list.size()-1);
            else
              list.remove(0);
            break;
          default:
        }
      }
    }
  }
}
