import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String readLine = br.readLine();
      while( readLine != null ) {
        readLine = readLine.trim();
        String[] readLineArray = readLine.split(" ");

        int h = Integer.parseInt(readLineArray[0]);
        int w = Integer.parseInt(readLineArray[1]);

        if ( h == 0 && w == 0) {
          break;
        }

        for (int i = 0 ; i < h ; i++) {
          for (int k = 0 ; k < w ; k++) {
            System.out.print("#");
          }
          System.out.print("\n");
        }
        System.out.print("\n");
        readLine = br.readLine();
      }
    br.close();
  }
}