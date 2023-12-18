import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    System.out.println(str.substring(0,1)
                      + str.substring(1,str.length()-1).length()
                      + str.substring(str.length()-1,str.length()));
  }
}