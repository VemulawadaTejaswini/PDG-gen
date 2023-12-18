import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      String INPUT_STR = input.readLine();
      String tmp = replaceChar(replaceChar(INPUT_STR, ',', ' '), '.', ' ');

      System.out.println(solver(tmp));
    }

  }

  private static String replaceChar(String input, char beforeChar, char afterChar)
  {
    char[] charArray = input.toCharArray();
    StringBuilder ret = new StringBuilder();
    for (char c : charArray)
    {
      if (c == beforeChar)
      {
        ret.append(afterChar);
      }
      else
      {
        ret.append(c);
      }
    }
    return ret.toString();
  }

  private static String solver(String input)
  {
    String[] stringArray = input.split(" ");
    StringBuilder ret = new StringBuilder();
    for (String string : stringArray)
    {
      if (3 <= string.length() && string.length() <= 6)
      {
        ret.append(string);
        ret.append(" ");
      }
    }
    return ret.toString().trim();
  }

}