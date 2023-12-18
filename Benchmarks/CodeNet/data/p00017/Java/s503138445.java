import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready()) {
      String data = input.readLine();
      String alterString = "";
      boolean okFlag = false;
      for (int i = 1; i < 27; i++) {
        alterString = getCeaserCipherString(data, i);
        for (String eachString : alterString.split(" ")) {
          if (eachString.equals("the") | eachString.equals("this") | eachString.equals("that")) {
            okFlag = true;
            break;
          }
        }
        if (okFlag) {
          System.out.println(alterString.trim());
          break;
        }
      }
    }
  }

  private static String[] getCeaserCipherString(String[] stringArray, int replaceNum) {
    String[] retStringArray = new String[stringArray.length];
    for (int i = 0; i < stringArray.length; i++) {
      String eachString = stringArray[i];
      String afterString = "";
      char[] charArray = eachString.toCharArray();
      for (char eachChar : charArray) {
        afterString += getCeaserCipherChar(eachChar, replaceNum);
      }
      retStringArray[i] = afterString;
    }
    return retStringArray;
  }

  private static String getCeaserCipherString(String string, int replaceNum) {
    String retString = "";
    char[] charArray = string.toCharArray();
    for (char eachChar : charArray) {
      retString += getCeaserCipherChar(eachChar, replaceNum);
    }
    return retString;
  }

  public static char getCeaserCipherChar(char c, int replaceNum) {
    ArrayList<Character> abcArray = new ArrayList<>(
        Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    if (c == '.' | c == ' ')
      return c;

    int indexBefor = abcArray.indexOf(c);

    if (indexBefor + replaceNum >= abcArray.size()) {
      return abcArray.get(indexBefor + replaceNum - abcArray.size());
    } else {
      return abcArray.get(indexBefor + replaceNum);
    }
  }
}