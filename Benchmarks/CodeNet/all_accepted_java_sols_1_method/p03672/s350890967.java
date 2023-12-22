import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    for(int i=s.length()-1; i>0; i--) {
      if(s.length()%2!=0)
        continue;
      if(s.substring(0,i/2).equals(s.substring(i/2,i))) {
        System.out.println(i);
        break;
      }
    }
  }
}