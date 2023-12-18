import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      while(true) {

        if( (line = br.readLine()) == null || line.isEmpty() ) break;

        Dice dice1 = new Dice(line.split(" "));
        System.out.println(dice1.doRotate(br.readLine()));
      }
    }
  }
}

class Dice {
  private int[] side;

  public Dice( int[] ia ) {
    side = Arrays.copyOf(ia, ia.length);
  }
  public Dice( String[] s ) {
    side = new int[s.length];
    for ( int i=0; i < 6; i++)
      side[i] = Integer.parseInt(diceNumStr[i]);
  }

  public int doRotate(String s) {
    for ( int i=0; i < s.length(); i++ ) {
      rotate(s.substring(i, i+1));
    }
    return side[0];
  }

  private void rotate(String o) {
    switch(o) {
      case "N" :
        rotateN();
        break;
      case "S" :
        rotateS();
        break;
      case "W" :
        rotateW();
        break;
      case "E":
        rotateE();
        break;
      default :
    }
  }

  private void rotateN() {
    int tmp = side[0];
    side[0] = side[1]; side[1] = side[5]; side[5] = side[4];
    side[5] = tmp;
  }
  private void rotateS() {
    int tmp = side[0];
    side[0] = side[4]; side[4] = side[5]; side[5] = side[1];
    side[1] = tmp;
  }
  private void rotateW() {
    int tmp = side[0];
    side[0] = side[2]; side[2] = side[5]; side[5] = side[3];
    side[3] = tmp;
  }
  private void rotateE() {
    int tmp = side[0];
    side[0] = side[3]; side[3] = side[5]; side[5] = side[2];
    side[2] = tmp;
  }
}
