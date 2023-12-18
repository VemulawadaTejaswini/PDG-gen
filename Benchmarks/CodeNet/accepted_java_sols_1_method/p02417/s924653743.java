import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      StringBuilder lowered = new StringBuilder();
      char c;
      char ca = "a".charAt(0);
      char cz = "z".charAt(0);
      int[] count = new int[26];

      while(true) {
        line = br.readLine();
        if ( line  == null || line.isEmpty() ) break;

        lowered.append(line.toLowerCase());
        for ( int i = 0; i < lowered.length(); i++ ) {
          c = lowered.charAt(i);
          if( ca > c || c > cz) continue;
          count[(c-ca)] += 1;
        }
        lowered.setLength(0);

      }

      for ( int i = 0; i < count.length; i++ ) {
        System.out.println(Character.valueOf((char)(ca + (char)i)).toString() + " : " + count[i]);
      }
    }
  }
}
