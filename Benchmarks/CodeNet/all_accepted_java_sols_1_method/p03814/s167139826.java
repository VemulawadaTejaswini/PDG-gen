import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    in.close();
    
    int a_location = 0;
    int z_location = 0;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i)=='A') {
        a_location = i+1;
        break;
      }
    }
    
    for(int i=0; i<s.length(); i++) {
      if(a_location != 0 && s.charAt(i)=='Z') {
        z_location = i+1;
      }
    }

    System.out.println(z_location - a_location + 1);
  }
}