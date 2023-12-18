
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);

    char[][] m = new char[100][100];

    for(int i = 0; i < 50; i++)
    {
      for(int j = 0; j < 100; j++)
      {
        m[i][j] = '.';
      }
    }
    a--;

    for(int i = 50; i < 100; i++)
    {
      for(int j = 0; j < 100; j++)
      {
        m[i][j] = '#';
      }
    }
    b--;

    int x = 0;
    int y = 0;
    while(b > 0)
    {
      m[x][y] = '#';
      y += 2;
      if(y >= 100)
      {
        y -= 100;
        x += 2;
      }
      b--;
    }

    x = 51;
    y = 0;
    while(a > 0)
    {
      m[x][y] = '.';
      y += 2;
      if(y >= 100)
      {
        y -= 100;
        x += 2;
      }
      a--;
    }

    System.out.println("100 100");
    for(int i = 0; i < 100; i++)
    {
      for(int j = 0; j < 100; j++)
      {
        System.out.print(m[i][j]);
      }
      System.out.print('\n');
    }
  }
}