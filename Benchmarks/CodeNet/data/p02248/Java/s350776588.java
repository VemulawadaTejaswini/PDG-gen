import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String t = br.readLine();
      String p = br.readLine();

      if(t.length() < p.length()) return;
      
      boolean soloChar = true;
      char pHead = p.charAt(0);
      for (char c : p.toCharArray()) {
        if(c != pHead) {
          soloChar = false;
          break;
        }
      }

      StringBuilder result = new StringBuilder();
      if(soloChar)
        searchStrSoloChar(t, p, result);
      else
        searchStr(t, p, result);

      System.out.print(result);

    } catch (IOException e) {
      System.err.println(e);
    }
  }

  private void searchStr(String txt, String key, StringBuilder buf) {

    Pattern ptn = Pattern.compile(key);
    Matcher mch = ptn.matcher(txt);

    for (int i = 0; mch.find(i); i++) {
      i = mch.start();
      buf.append(i).append("\n");
    }
  }
  private void searchStrSoloChar(String txt, String key, StringBuilder buf) {

    int max = txt.length() - key.length();
    char kHead = key.charAt(0);
    int first = txt.indexOf(key);
    buf.append(first).append("\n");
    for (int i = first+1;i <= max; i++) {
      if(txt.charAt(i+key.length()-1) == kHead ) {
        buf.append(i).append("\n");
      }
      else {
        i = txt.indexOf(key,i);
        if(i == -1) break;
        else
          buf.append(i).append("\n");
      }
    }
  }
}
