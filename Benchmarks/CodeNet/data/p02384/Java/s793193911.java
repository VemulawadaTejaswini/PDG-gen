import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      Dice dice2 = new Dice(br.readLine().split(" "));
      int upper,front;
      br.readLine();
      while(true) {

        if( (line = br.readLine()) == null || line.isEmpty() ) break;

        upper = Integer.parseInt(line.split(" ")[0]);
        front = Integer.parseInt(line.split(" ")[1]);

        while(true){
          if( dice2.getFrontSide() == front){
            for (int i=0; i<3; i++)
              if(dice2.getUpperSide() == upper) break;
              dice2.rotate("W");
          }
          else {
            for(int i=0; i < 4; i++)
              if(dice2.getUpperSide() != front) dice2.rotate("N");
            for(int i=0; i < 4; i++)
              if(dice2.getUpperSide() != front) dice2.rotate("W");
            if(dice2.getUpperSide() != upper) dice2.rotate("S");
          }
          if( (dice2.getUpperSide()==upper) && (dice2.getFrontSide()==front)) break;
        }
        System.out.println(dice2.getRightSide());
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
      side[i] = Integer.parseInt(s[i]);
  }

  public void setDice(int[] ia) {
    side = Arrays.copyOf(ia, ia.length);
  }

  public int getUpperSide() {
    return side[0];
  }
  public int getFrontSide() {
    return side[1];
  }
  public int getRightSide() {
    return side[2];
  }

  public int doRotate(String s) {
    for ( int i=0; i < s.length(); i++ ) {
      rotate(s.substring(i, i+1));
    }
    return side[0];
  }

  public void rotate(String o) {
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
    side[4] = tmp;
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
