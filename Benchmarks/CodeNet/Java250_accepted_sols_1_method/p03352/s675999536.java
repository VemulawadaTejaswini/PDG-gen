import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];
    s = r.readLine();
    sl = s.split(" ");
    
    int v[] = new int[1234];

    int x = Integer.parseInt(sl[0]);
    
    v[1] = 1;
    for(int i = 2; i <= 1000; i++)
    {
      for(int j = i * i; j <= 1000; j *= i)
      {
        v[j] = 1;
      }
    }
    
    for(int i = x; ; i--)
    {
      if(v[i] == 1)
      {
        System.out.println(i);
        System.exit(0);
      }
    }

  }

}