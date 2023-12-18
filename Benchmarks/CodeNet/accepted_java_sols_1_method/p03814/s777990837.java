import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    char[] charArray = line.toCharArray();
    int firstA = 0;
    int lastZ = 0;
    for (int i = 0; i < charArray.length; i++) {
      //System.out.println(charArray[i]);
      if (charArray[i] == 'A') {
        firstA = i;
        break;
      }
    }
    for (int i = (charArray.length - 1); i > 0 ; i--) {
      //System.out.println(charArray[i]);
      if (charArray[i] == 'Z') {
        lastZ = i;
        break;
      }
    }
    //System.out.println(firstA + "," + lastZ);
    System.out.println(lastZ - firstA + 1);
  }
}