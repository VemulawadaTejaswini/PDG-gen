import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      StringBuilder cards = new StringBuilder();
      int sTimes = 0;
      int cuts = 0;

      while(true){

        if( (line = br.readLine()).equals("-") ) break;

        cards.append(line);
        sTimes = Integer.parseInt(br.readLine());

        for ( int i = 0; i < sTimes; i++ ) {
          cuts = Integer.parseInt(br.readLine());
          cards.append(cards.substring(0, cuts));
          cards.delete(0,cuts);
        }

        System.out.println(cards);

        cards.setLength(0);
      }
    }
  }
}
