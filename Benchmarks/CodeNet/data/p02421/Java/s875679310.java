import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      StringBuilder line  = new StringBuilder();
      StringBuilder wordA = new StringBuilder();
      StringBuilder wordB = new StringBuilder();
      Collator collator = Collator.getInstance();
      int turn = Integer.parseInt(br.readLine());
      int pointA = 0;
      int pointB = 0;
      int result = 0;


      for ( int i = 0; i < turn; i++ ) {

        line.append(br.readLine());
        wordA.append(line.substring(0, line.indexOf(" ")));
        wordB.append(line.substring(line.indexOf(" ")+1, line.length()));

        result = collator.compare(wordA.toString(),wordB.toString());
        pointA += result == 0 ? 1 : result < 0 ? 0 : 3;
        pointB += result == 0 ? 1 : result < 0 ? 3 : 0;

        line.setLength(0);
        wordA.setLength(0);
        wordB.setLength(0);
      }

      System.out.println(pointA + " " + pointB);
    }
  }
}
