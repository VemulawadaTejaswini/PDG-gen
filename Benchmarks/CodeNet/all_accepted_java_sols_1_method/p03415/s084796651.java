import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[][] c = new String[3][3];
    String[] str = new String[10];
    for(int i=0; i<3; i++) {
      str = in.readLine().split("");
      for(int j=0; j<3; j++) {
        c[i][j] = str[j];
      }
    }
    System.out.println(c[0][0] + "" + c[1][1] + "" + c[2][2]);
  }
}