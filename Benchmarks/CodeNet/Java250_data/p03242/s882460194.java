import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String line = in.readLine();

      char[] str = new char[line.length()];
      int i = 0;
      for (char ch : line.toCharArray()) {
        if(ch == '1')
          str[i++] = '9';
        else if (ch == '9')
          str[i++] = '1';
        else
          str[i++] = ch;
      }

      System.out.println(str);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}