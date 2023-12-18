import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());

    int f = 0;
    for(int a = n; a > 0; a /= 10)
    {
      f += a % 10;
    }
    
    System.out.println(n % f == 0 ? "Yes" : "No");
  }

}