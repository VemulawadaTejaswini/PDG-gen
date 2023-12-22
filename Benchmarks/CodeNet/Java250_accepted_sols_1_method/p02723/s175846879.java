import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    if(str.substring(2,3).equals(str.substring(3,4))
       && str.substring(4,5).equals(str.substring(5,6)))
       System.out.println("Yes");
       else
       System.out.println("No");
  }
}