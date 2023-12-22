
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr = reader.readLine();
    char[] readStrChars = readStr.toCharArray();
    
    for (int i = 0; i < readStrChars.length; i++) {
      if (readStrChars[i] >= 'a' && readStrChars[i] <= 'z') {
        readStrChars[i] += 'A' - 'a';
      }
    }
    System.out.println(new String(readStrChars));
  }

}