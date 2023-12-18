import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    s = r.readLine();

    if(s.contains("Y"))
    System.out.println("Four");
    else
      System.out.println("Three");
  }

}
