/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    String[] s = br.readLine().split(" ");
    int nRows = Integer.parseInt(s[0]);
    int nCols = Integer.parseInt(s[1]);
    int A = Integer.parseInt(s[2]);
    int B = Integer.parseInt(s[3]);
    for (int i=0; i<nRows; i++) {
      for (int j=0; j<nCols; j++) {
        if ((i<B && j<A) || (i>=B && j>=A)) {
          sb.append('0');
        } else {
          sb.append('1');
        }
      }
      sb.append('\n');
    }
    System.out.print(sb);
  }
}
