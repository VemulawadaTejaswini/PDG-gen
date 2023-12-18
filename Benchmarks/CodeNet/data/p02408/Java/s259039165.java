import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      Boolean[][] checkCards = new Boolean[4][13];
      for( int i = 0; i < 4; i++ ) {
        Arrays.fill(checkCards[i], false);
      }
      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int a,b;

      for(int i = 0; i < n; i++) {
        lines = br.readLine().split(" ");
        a = suitToInt(lines[0]);
        b = Integer.parseInt(lines[1]);
        checkCards[a][b-1] = true;
      }

      for(int i = 0; i < 4; i++ ) {
        for( int j = 0; j < 13; j++ ) {
          if(!checkCards[i][j]) System.out.println(intToSuit(i) + " " + (j+1));
        }
      }
    }
  }

  public static int suitToInt( String suit ) {
    switch( suit ) {
      case "S": return 0;
      case "H": return 1;
      case "C": return 2;
      default : return 3;
    }
  }
  public static String intToSuit( int r ) {
    switch( r ) {
      case 0  : return "S";
      case 1  : return "H";
      case 2  : return "C";
      default : return "D";
    }
  }
}
