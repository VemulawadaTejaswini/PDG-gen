import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());
    if(n == 1)
    {
      System.out.println("Hello World");
    }
    else
    {
      int x = Integer.parseInt(r.readLine());
      int y = Integer.parseInt(r.readLine());
      System.out.println(x + y);
    }
  }

}