import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      LinkedList<String> list = new LinkedList<>();
      ListIterator<String> ite  = list.listIterator();
      // list.add("END");
      int p = 0;
      String[] query;

      int op,move;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            ite.add(query[1]);
            ite.previous();
            break;
          case 1 :
            move = Integer.parseInt(query[1]);
            for ( int j=0; j<=move; j++ )
              ite.next();
            break;
          case 2 :
            ite.remove();
            break;
          default:
        }
      }

      list.forEach(System.out::println);
    }
  }
}
