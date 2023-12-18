import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int countZero = 0;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i)=='0')
        countZero++;
    }
    System.out.println(countZero<s.length()-countZero?countZero*2:(s.length()-countZero)*2);
  }
}