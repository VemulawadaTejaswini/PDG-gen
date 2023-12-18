
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

  public static final int alphabet_num = 'z' - 'a';

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    while ((in = reader.readLine()) != null) {

      int diffA = 0;
      int diffB = 0;
      boolean toggle = false;
      while (true) {
        String str = getDisplaceStr(in, toggle ? diffA : diffB);
        boolean containsThe_This_That = containsThe_This_That(str);
        if (containsThe_This_That) {
          System.out.println(str);
          break;
        } else {
          if (toggle)
            diffA++;
          else
            diffB--;
          toggle = !toggle;
        }
      }

    }
  }

  public static boolean containsThe_This_That(String str) {
    for (String splited : str.split(" ")) {
      splited = splited.replace(".", "");
      if (splited.equals("the") || splited.equals("this") || splited.equals("that"))
        return true;
    }
    return false;
  }

  public static String getDisplaceStr(String in, int diff) {
    char[] cryptedChars = in.toCharArray();
    char[] decryptedChars = new char[cryptedChars.length];
    for (int i = 0; i < cryptedChars.length; i++) {
      Pattern p = Pattern.compile("[a-z]");
      if (p.matcher(String.valueOf(cryptedChars[i])).find()) {
        int index = cryptedChars[i] - 'a';
        int displacedIndex;
        if (index + diff < 0)
          displacedIndex = 27 - (index + diff) % alphabet_num;
        else
          displacedIndex = (index + diff) % alphabet_num;
        decryptedChars[i] = (char) (displacedIndex + 'a');
      } else {
        decryptedChars[i] = cryptedChars[i];
      }
    }
    return String.valueOf(decryptedChars);
  }

}