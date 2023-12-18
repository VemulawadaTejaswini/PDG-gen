import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    char[] charArray = line.toCharArray();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < charArray.length; i ++) {
      //System.out.println(charArray[i]);
      if ((i + 1)%2 != 0) {
        sb.append(charArray[i]);
      }
    }
    System.out.println(sb.toString());
  }
}