import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      List<String> list = new LinkedList<>();
      // list.add("END");
      int p = 0;
      String[] query;

      int op;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            list.add(p,query[1]);
            break;
          case 1 :
            p += Integer.parseInt(query[1]);
            break;
          case 2 :
            list.remove(p);
            break;
          default:
        }
      }

      list.forEach(System.out::println);
    }
  }
}
