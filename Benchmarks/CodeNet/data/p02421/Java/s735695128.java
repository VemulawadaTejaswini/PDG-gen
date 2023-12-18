import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      StringBuilder line  = new StringBuilder();
      StringBuilder wordA = new StringBuilder();
      StringBuilder wordB = new StringBuilder();
      int turn = Integer.parseInt(br.readLine());
      int pointA = 0;
      int pointB = 0;
      int lenA = 0;
      int lenB = 0;
      int len = 0;


      for ( int i = 0; i < turn; i++ ) {

        line.append(br.readLine());
        wordA.append(line.substring(0, line.indexOf(" ")));
        wordB.append(line.substring(line.indexOf(" ")+1, line.length()));

        if( (lenA = wordA.length()) < (lenB = wordB.length()) ) len = wordA.length();
        else if( lenA > lenB ) len = lenB;
        else len = lenA;

        for ( int j = 0; j < len; j++) {

          if ( wordA.charAt(j) > wordB.charAt(j)){
            pointA += 3;
            break;
          } else if ( wordB.charAt(j) > wordA.charAt(j) ) {
            pointB += 3;
            break;
          } else if ( j == (len-1) ) {
            if(lenA == lenB){
              pointA += 1;
              pointB += 1;
              break;
            } else if (lenA > lenB) {
              pointA += 3;
            } else {
              pointB += 3;
            }
          } else {
            continue;
          }
        }

        line.setLength(0);
        wordA.setLength(0);
        wordB.setLength(0);
      }

      System.out.println(pointA + " " + pointB);
    }
  }
}
