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
      int fd = Character.getNumericValue(line.charAt(0));

      int up = 0;
      for (int i = line.length()-1; i > 0; i--) {
        int digit = Character.getNumericValue(line.charAt(i));
        if(digit + up > fd) {
          up = 1;
        }
        else {
          up = 0;
        }
      }

      int cd=Character.getNumericValue(line.charAt(1));
      if(fd < cd + up)
        fd++;

      StringBuffer buf = new StringBuffer();
      for(int i=0; i<line.length(); i++)
        buf.append(fd);


      System.out.println(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}