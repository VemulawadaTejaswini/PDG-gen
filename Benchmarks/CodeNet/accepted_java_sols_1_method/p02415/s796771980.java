import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line = br.readLine();
      StringBuffer str = new StringBuffer(line.length());
      String s;

      for(int i = 0;i < line.length();i++) {
        s = line.substring(i,i+1);
        if( Character.isUpperCase(s.charAt(0)) )
          str.append(s.toLowerCase());
        else if ( Character.isLowerCase(s.charAt(0)) )
          str.append(s.toUpperCase());
        else
          str.append(s);
      }

      System.out.println(str);
    }
  }
}
