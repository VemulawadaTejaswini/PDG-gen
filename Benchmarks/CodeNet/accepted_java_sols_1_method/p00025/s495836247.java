import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String a = "";
    String b = "";
    while(((a = br.readLine()) != null) && ((b = br.readLine()) != null)){
      int hit = 0;
      int blow = 0;

      String[] al = new String [4];
      al = a.split(" ");

      String[] bl = new String[4];
      bl = b.split(" ");

      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
          if (al[i].equals(bl[j])) {
            if (i == j) {
              hit++;
            } else {
              blow++;
            }
          }
        }
      }
      System.out.println(hit+" "+blow);
    }
  }
}